package acme.car.repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;

import acme.car.model.Customer;

@ApplicationScoped
public class CustomerRepository {

	private Set<Customer> customers = new HashSet<>();
	
	public CustomerRepository() {
        add(new Customer(1L, "John Smith"));
        add(new Customer(2L, "Paul Walker"));
    }
 
    public Customer add(Customer employee) {
        employee.setId((long) (customers.size()+1));
        customers.add(employee);
        return employee;
    }
     
    public Customer findById(String name) {
        Optional<Customer> employee = customers.stream().filter(a -> a.getName().equals(name)).findFirst();
        if (employee.isPresent())
            return employee.get();
        else
            return null;
    }
 
    public Set<Customer> list() {
        return customers;
    }
}
