package acme.fly.model;

import java.time.LocalDate;

public interface Reservable {
	String getName();
	ServiceStatus getStatus();
	LocalDate getInitialDay();
	LocalDate getEndDay();
}
