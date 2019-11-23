package acme.car.model;

import java.util.Date;

public class CarReserve implements Reservable {

	private String name;
	private ServiceStatus status;
	private Date initialDay;
	private Date endDay;
	private String customer;
	private Float price;

	public CarReserve() {
	}
	
	public CarReserve(String customer, String name, ServiceStatus status, Float price, Date initialDay, Date endDay) {
		super();
		this.customer = customer;
		this.name = name;
		this.status = status;
		this.price = price;
		this.initialDay = initialDay;
		this.endDay = endDay;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServiceStatus getStatus() {
		return status;
	}

	public void setStatus(ServiceStatus status) {
		this.status = status;
	}

	public Date getInitialDay() {
		return initialDay;
	}

	public void setInitialDay(Date initialDay) {
		this.initialDay = initialDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarReserve [customer=" + customer + ", name=" + name + ", status=" + status + ", initialDay="
				+ initialDay + ", endDay=" + endDay + ", price=" + price + "]";
	}

}
