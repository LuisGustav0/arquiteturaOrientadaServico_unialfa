package acme.hotel.model;

import java.util.List;

import lombok.Data;

@Data
public class Customer {
	private String name;
	private List<Reservable> reservables;
}
