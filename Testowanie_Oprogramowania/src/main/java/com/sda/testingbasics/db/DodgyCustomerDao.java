package com.sda.testingbasics.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DodgyCustomerDao implements CustomerDao {

    private final Map<String, Customer> customers;

    public DodgyCustomerDao() {
        customers = new HashMap<>();
    }

    @Override
    public void add(Customer customer){
        customers.put(customer.getName(), customer);
    }

    @Override
    public void update(Customer customer) {
        customers.put(customer.getName(), customer);
    }

    @Override
    public Customer remove(Customer customer) {
        return customers.remove(customer);
    }

    @Override
    public Customer find(String name) {
        return customers.get(name);
    }

    @Override
    public Collection<Customer> getAll() {
        return customers.values();
    }
}
