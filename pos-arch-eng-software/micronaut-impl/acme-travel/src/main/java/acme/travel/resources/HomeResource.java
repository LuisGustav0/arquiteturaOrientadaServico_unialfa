package acme.travel.resources;

import javax.validation.constraints.NotBlank;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.tracing.annotation.ContinueSpan;
import io.micronaut.tracing.annotation.SpanTag;

/*
@OpenAPIDefinition(
	    info = @Info(
	        title = "Acme Travel Resources",
	        version = "1.0",
	        description = "Acme Travel API",
	        contact = @Contact(url = "https://acme.org", name = "Alisson Gomes", email = "alisson.gomesc@gmail.com")
	    )
	)
*/
@Controller("/api")
public class HomeResource {

	public HomeResource() {
	}

	@ContinueSpan 
	@Get("/greeting")
	@Produces(MediaType.TEXT_PLAIN)
	String greeting() {
		return "Hello Micronaut World! I am acme-travel";
	}

	@ContinueSpan 
	@Get("/greeting/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	String greeting(@SpanTag("name") @NotBlank String name) {
		return "Hello " + name;
	}

}
