package acme.pay.model;

import java.time.LocalDate;

public interface Reservable {
	String getName();
	String getCustomer();
	ServiceStatus getStatus();
	LocalDate getInitialDay();
	LocalDate getEndDay();
	Float getPrice();
	void setPrice(Float price);
}
