package com.packt.webstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by S41 on 2017-06-01.
 */
@Data
@AllArgsConstructor
public class Customer {
    String customerId;
    String name;
    String address;
    Long noOfOrdersMade;

    public Customer() {
    }
}
