package acme.fly.resources;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * A simple Camel route that triggers from a timer and calls a bean and prints
 * to system out.
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class RestResources extends RouteBuilder {

	@Override
	public void configure() {

		rest().enableCORS(true)
			.consumes("application/json")
			.produces("application/json")
			.get("/greeting").produces("text/plain").to("direct:greeting")
			.get("/customer").to("direct:customer-list");
	}
}
