package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Customer;

import java.util.List;

/**
 * Created by S41 on 2017-06-01.
 */
public interface CustomerRepository {
    List<Customer> getAllCustomers();
}
