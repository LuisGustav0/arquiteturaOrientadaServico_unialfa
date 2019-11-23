package acme.travel.resources;

import acme.travel.model.CarReserve;
import acme.travel.model.ServiceStatus;
import acme.travel.mq.CarReservationClient;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/car")
public class CarResource {

    private final CarReservationClient carReservationClient; 

    public CarResource(CarReservationClient carReservationClient) { 
        this.carReservationClient= carReservationClient;
    }

	@Post("/")
	@Consumes(MediaType.APPLICATION_JSON)
	CarReserve request(@Body CarReserve reserve) {
		carReservationClient.send(reserve);
		reserve.setStatus(ServiceStatus.CONFIRM);
		return reserve;
	}
}
