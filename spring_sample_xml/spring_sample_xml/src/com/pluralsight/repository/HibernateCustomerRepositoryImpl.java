/**
 * Created by WeichengXu on 10/1/2016.
 */
package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Weicheng");
        customer.setLastName("Xu");

        customers.add(customer);

        return customers;
    }
}
