package acme.car.model;

import java.util.Date;

public interface Reservable {
	String getName();
	String getCustomer();
	ServiceStatus getStatus();
	Date getInitialDay();
	Date getEndDay();
	Float getPrice();
	void setPrice(Float price);
}
