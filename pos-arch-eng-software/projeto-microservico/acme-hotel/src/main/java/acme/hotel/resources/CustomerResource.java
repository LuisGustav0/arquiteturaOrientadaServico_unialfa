package acme.hotel.resources;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import acme.hotel.model.Customer;
import acme.hotel.service.CustomerService;

@ApplicationScoped
@Path("/customer")
public class CustomerResource {

	@Inject
	CustomerService service;
	
	@GET
	@Produces("application/json")
	public List<Customer> list() {
		return service.list();
	}	
}
