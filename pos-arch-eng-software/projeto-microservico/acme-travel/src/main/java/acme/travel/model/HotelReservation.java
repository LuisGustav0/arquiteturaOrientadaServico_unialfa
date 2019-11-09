package acme.travel.model;

import java.time.LocalDate;

public class HotelReservation implements Reservable {

	private String name;
	private ServiceType type;
	private ServiceStatus status;
	private LocalDate initialDay;
	private LocalDate endDay;

	public HotelReservation(String name, LocalDate initialDay, LocalDate endDay, ServiceStatus status) {
		super();
		this.type = ServiceType.HOTEL;
		this.name = name;
		this.status = status;
		this.initialDay = initialDay;
		this.endDay = endDay;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public ServiceType getType() {
		return type;
	}

	@Override
	public LocalDate getInitialDay() {
		return initialDay;
	}

	@Override
	public LocalDate getEndDay() {
		return endDay;
	}

	@Override
	public ServiceStatus getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "HotelReservation [name=" + name + ", type=" + type + ", initialDay=" + initialDay + ", endDay=" + endDay
				+ "]";
	}


}
