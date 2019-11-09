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
public class HomeResource extends RouteBuilder {

	@Override
    public void configure() {

        from("direct:greeting").streamCaching()
        .transform().constant("Hello Camel World! I am acme-fly")
        .end();
    }
}
