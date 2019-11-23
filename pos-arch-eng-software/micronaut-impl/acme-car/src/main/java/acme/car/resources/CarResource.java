package acme.car.resources;

import java.util.Optional;
import java.util.Set;

import javax.inject.Inject;

import acme.car.model.Reservable;
import acme.car.repository.CarRepository;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/car")
public class CarResource {

	@Inject
	CarRepository repository;
	
	public CarResource(CarRepository repository) { 
        this.repository = repository;
    }

	@Get("/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	Optional<Set<Reservable>> byCustomerName(String name) {
		return repository.findByName(name);
	}
}
