package acme.travel.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import acme.travel.model.Customer;

@Service
public class CustomerService {

    public List<Customer> list() {
        return Collections.emptyList();
    }
}
