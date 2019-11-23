package acme.pay.resources;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/api")
public class HomeResource {


	@Get("/greeting")
	@Produces(MediaType.TEXT_PLAIN) 
	public String greeting() {
		return "Hello Micronaut World! I am acme-pay";
	}
	
	
}
