package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private List<Customer> listOfCustomers;

    public InMemoryCustomerRepository(){
        Customer customer1 = new Customer("1","Kowalski", "Lublin", 1L);
        Customer customer2 = new Customer("2","Sraczkowski", "Warszawa", 2L);
        Customer customer3 = new Customer("3","Mucha", "Kraków", 0L);
        listOfCustomers.add(customer1);
        listOfCustomers.add(customer2);
        listOfCustomers.add(customer3);
    }

    public List<Customer> getAllCustomers() {
        return listOfCustomers;
    }
}
