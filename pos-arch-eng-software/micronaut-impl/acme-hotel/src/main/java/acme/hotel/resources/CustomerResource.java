package acme.hotel.resources;

import java.util.List;

import javax.inject.Inject;

import acme.hotel.model.Customer;
import acme.hotel.service.CustomerService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/customer")
public class CustomerResource {

	@Inject
	CustomerService service;
	
	@Get("/")
	public List<Customer> list() {
		return service.list();
	}	
}
