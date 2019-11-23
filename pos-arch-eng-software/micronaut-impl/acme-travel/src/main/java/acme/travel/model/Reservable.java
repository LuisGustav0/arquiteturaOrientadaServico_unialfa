package acme.travel.model;

import java.io.Serializable;
import java.util.Date;

public interface Reservable extends Serializable {
	String getName();
	String getCustomer();
	ServiceType getType();
	ServiceStatus getStatus();
	Date getInitialDay();
	Date getEndDay();
	Float getPrice();
	void setPrice(Float price);
}
