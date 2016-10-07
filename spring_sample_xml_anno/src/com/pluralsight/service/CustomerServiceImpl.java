/**
 * Created by WeichengXu on 10/1/2016.
 */
package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
    }

    @Autowired // constructor injection
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Constructor injection.");
        this.customerRepository = customerRepository;
    }

//    @Autowired  setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setting injection.");
        this.customerRepository = customerRepository;
    }

    //@Autowired member injection
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
