package acme.travel.resources;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class SpringBootHomeResourceTest {

    @Test
    public void whenGreetingEndpointWorks() {
        given().port(8180)
          .when().get("/api/greeting")
          .then()
             .statusCode(200)
             .body(is("Hello Spring-boot World!"));
    }

}