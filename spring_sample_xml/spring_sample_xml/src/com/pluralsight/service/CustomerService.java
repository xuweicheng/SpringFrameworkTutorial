package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by WeichengXu on 10/1/2016.
 */
public interface CustomerService {
    List<Customer> findAll();
}
