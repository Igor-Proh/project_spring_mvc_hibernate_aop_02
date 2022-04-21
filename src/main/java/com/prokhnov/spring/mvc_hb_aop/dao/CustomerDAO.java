package com.prokhnov.spring.mvc_hb_aop.dao;

import com.prokhnov.spring.mvc_hb_aop.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);
}
