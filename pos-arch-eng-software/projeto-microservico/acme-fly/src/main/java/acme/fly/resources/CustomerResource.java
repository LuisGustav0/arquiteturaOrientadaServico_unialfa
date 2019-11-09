package acme.fly.resources;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import acme.fly.service.CustomerService;

/**
 * A simple Camel route that triggers from a timer and calls a bean and prints
 * to system out.
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class CustomerResource extends RouteBuilder {

	@Autowired
	CustomerService service;
	
	
	@Override
    public void configure() {
        from("direct:customer-list").streamCaching()
        .bean(CustomerService.class, "list")
        .end();
    }
}
