package acme.travel.model;

import java.time.LocalDate;

public class CarReservation implements Reservable {

	private String name;
	private ServiceType type;
	private ServiceStatus status;
	private LocalDate initialDay;
	private LocalDate endDay;

	public CarReservation(String name, LocalDate initialDay, LocalDate endDay, ServiceStatus status) {
		super();
		this.type = ServiceType.CAR;
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
	public ServiceType getType() {
		return type;
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
		return "CarReservation [name=" + name + ", type=" + type + ", initialDay=" + initialDay + ", endDay=" + endDay
				+ "]";
	}

}
