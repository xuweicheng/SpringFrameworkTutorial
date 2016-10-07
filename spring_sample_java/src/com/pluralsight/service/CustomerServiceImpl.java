/**
 * Created by WeichengXu on 10/1/2016.
 */
package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
//@Scope("singleton") //because this is in score of singleton, we only have one instance for this class
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
    public CustomerServiceImpl() {
    }

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Constructor Injection.");
        this.customerRepository = customerRepository;
    }

//    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setter Injection.");
        this.customerRepository = customerRepository;
    }

//    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
