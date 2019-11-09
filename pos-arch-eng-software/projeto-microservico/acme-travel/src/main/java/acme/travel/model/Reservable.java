package acme.travel.model;

import java.time.LocalDate;

public interface Reservable {
	String getName();
	ServiceType getType();
	ServiceStatus getStatus();
	LocalDate getInitialDay();
	LocalDate getEndDay();
}
