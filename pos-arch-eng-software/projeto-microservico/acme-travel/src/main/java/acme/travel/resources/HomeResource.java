package acme.travel.resources;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeResource {

	@RequestMapping("/greeting")
	public String greeting() {
		return "Hello Spring-boot World! I am acme-travel";
	}
	
	
}
