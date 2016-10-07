/**
 * Created by WeichengXu on 10/1/2016.
 */
package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${someProperty}")
    private String someValue;
    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

//        customer.setFirstName("Weicheng");
        customer.setFirstName(someValue);
        customer.setLastName("Xu");

        customers.add(customer);

        return customers;
    }
}
