package acme.fly.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import acme.fly.model.Customer;

@Service
public class CustomerService {

    public List<Customer> list() {
        return Collections.emptyList();
    }
}
