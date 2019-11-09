package acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class QuarkusHomeResourceTest {

    @Test
    public void whenGreetingEndpointWorks() {
        given()
          .when().get("/api/greeting")
          .then()
             .statusCode(200)
             .body(is("Hello Quarkus world!"));
    }

}