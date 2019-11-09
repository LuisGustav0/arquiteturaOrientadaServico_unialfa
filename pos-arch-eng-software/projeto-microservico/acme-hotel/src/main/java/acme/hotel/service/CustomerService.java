package acme.hotel.service;

import java.util.Collections;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import acme.hotel.model.Customer;

@ApplicationScoped
public class CustomerService {

    public List<Customer> list() {
        return Collections.emptyList();
    }
}
