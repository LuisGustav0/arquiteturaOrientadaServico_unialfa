package acme.car.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/")
public class HomeResource {

    @GET
    @Produces("text/plain")
    @Path("/greeting")
    public Response greeting() {
        return Response.ok("Hello Thorntail world! I am acme-car").build();
    }

}
