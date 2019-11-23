package acme.car.service;

import java.util.Collections;
import java.util.List;

import javax.inject.Singleton;

import acme.car.model.Customer;

@Singleton
public class CustomerService {

    public List<Customer> list() {
        return Collections.emptyList();
    }
}
