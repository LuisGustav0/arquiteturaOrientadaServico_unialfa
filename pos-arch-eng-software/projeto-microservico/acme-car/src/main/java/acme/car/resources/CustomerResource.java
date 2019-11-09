package acme.car.resources;

import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import acme.car.model.Customer;
import acme.car.service.CustomerService;

@ApplicationScoped
@Path("/customer")
public class CustomerResource {

	@Inject
	CustomerService service;
	
	@GET
	@Produces("application/json")
	public Set<Customer> list() {
		return service.list();
	}	
}
