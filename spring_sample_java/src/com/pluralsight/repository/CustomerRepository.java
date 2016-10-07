package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by WeichengXu on 10/1/2016.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
