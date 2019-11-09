package acme.car.model;

import java.time.LocalDate;

public class CarReservation implements Reservable {

	private String name;
	private ServiceStatus status;
	private LocalDate initialDay;
	private LocalDate endDay;

	public CarReservation(String name, LocalDate initialDay, LocalDate endDay, ServiceStatus status) {
		super();
		this.name = name;
		this.status = status;
		this.initialDay = initialDay;
		this.endDay = endDay;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public LocalDate getInitialDay() {
		return initialDay;
	}

	@Override
	public LocalDate getEndDay() {
		return endDay;
	}

	@Override
	public ServiceStatus getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "CarReservation [name=" + name + ", initialDay=" + initialDay + ", endDay=" + endDay
				+ "]";
	}

}
