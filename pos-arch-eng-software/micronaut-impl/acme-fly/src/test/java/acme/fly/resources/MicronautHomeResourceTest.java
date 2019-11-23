package acme.fly.resources;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;


@MicronautTest
public class MicronautHomeResourceTest {
    
	@Inject
    @Client("/")
    RxHttpClient client; 

    @Test
    public void whenGreetingEndpointWorks() {
        HttpRequest<String> request = HttpRequest.GET("/api/greeting"); 
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals("Hello Micronaut World! I am acme-pay", body);
    }

}