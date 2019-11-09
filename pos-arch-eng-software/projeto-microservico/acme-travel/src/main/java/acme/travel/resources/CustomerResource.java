package acme.travel.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import acme.travel.model.Customer;

/**
 * A simple Camel route that triggers from a timer and calls a bean and prints
 * to system out.
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@RestController
public class CustomerResource {

	@Autowired
	acme.travel.service.CustomerService service;
	
	@RequestMapping("/customer")
	public List<Customer> list() {
		return service.list();
	}	
}
