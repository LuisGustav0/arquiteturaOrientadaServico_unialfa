package acme.fly.service;

import java.util.Collections;
import java.util.List;

import javax.inject.Singleton;

import acme.fly.model.Customer;

@Singleton
public class CustomerService {

    public List<Customer> list() {
        return Collections.emptyList();
    }
}
