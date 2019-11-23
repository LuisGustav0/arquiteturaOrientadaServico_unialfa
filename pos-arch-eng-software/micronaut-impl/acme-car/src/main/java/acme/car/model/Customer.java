package acme.car.model;

import java.util.List;

import lombok.Data;

@Data
public class Customer {
	
	private Long id;
	private String name;
	private List<Reservable> cars;
	
	public Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
