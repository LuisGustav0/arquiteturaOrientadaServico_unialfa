package acme.car.mq;

import javax.inject.Inject;

import acme.car.model.CarReserve;
import acme.car.repository.CarRepository;
import io.micronaut.configuration.rabbitmq.annotation.Queue;
import io.micronaut.configuration.rabbitmq.annotation.RabbitListener;

@RabbitListener
public class CarServiceRequest {

	@Inject
	CarRepository repository;

	@Queue("car-service") 
    public void receive(CarReserve reserve) {
		System.out.println("service request: "+reserve);
		repository.add(reserve);
    }
    
	
}
