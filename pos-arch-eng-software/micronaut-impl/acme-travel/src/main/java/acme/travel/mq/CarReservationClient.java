package acme.travel.mq;

import acme.travel.model.CarReserve;
import io.micronaut.configuration.rabbitmq.annotation.Binding;
import io.micronaut.configuration.rabbitmq.annotation.RabbitClient;

@RabbitClient("acme-queue")
public interface CarReservationClient {

	@Binding("acme.car.service") 
	void send(CarReserve reservable);
}
