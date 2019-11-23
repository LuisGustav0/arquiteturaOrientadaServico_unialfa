package acme.car.repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.inject.Singleton;

import acme.car.model.CarReserve;
import acme.car.model.Reservable;
import acme.car.model.ServiceStatus;

@Singleton
public class CarRepository {

	private static final Map<String, Set<Reservable>> RESERVES = new HashMap<>();

	public CarRepository() {
		add(new CarReserve("Maria", "onix", ServiceStatus.PENDING_PAYMENT, 50F, new Date(), new Date()));
		add(new CarReserve("Joana", "gol", ServiceStatus.CONFIRM, 40F, new Date(), new Date()));
	}

	public void add(Reservable reserve) {
		Set<Reservable> reserves = RESERVES.get(reserve.getCustomer());
		if (reserves == null) {
			reserves = new HashSet<Reservable>();
			RESERVES.put(reserve.getCustomer(), reserves);
		}
		reserves.add(reserve);
	}

	public Optional<Set<Reservable>> findByName(String name) {
		Optional<Set<Reservable>> filter = RESERVES.entrySet().stream().filter(map -> map.getKey().equals(name))
				.map(Map.Entry::getValue).findFirst();
				//.collect(Collectors.toSet());
		return filter;
	}

	public Collection<Set<Reservable>> list() {
		return RESERVES.values();
	}
}
