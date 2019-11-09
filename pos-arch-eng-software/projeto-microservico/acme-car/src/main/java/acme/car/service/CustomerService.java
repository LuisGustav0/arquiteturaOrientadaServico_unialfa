package acme.car.service;

import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import acme.car.model.Customer;
import acme.car.repository.CustomerRepository;

@ApplicationScoped
public class CustomerService {

	@Inject
	CustomerRepository repository;

    public Set<Customer> list() {
        return repository.list();
    }
}
