package com.sda.testingbasics.db2;

import com.sda.testingbasics.db.Customer;
import com.sda.testingbasics.db.AlreadyExistsException;
import com.sda.testingbasics.db.CustomerDao;
import com.sda.testingbasics.db.NotFoundException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SlightlyBetterCustomerDao implements CustomerDao {

    private final Map<String, Customer> customers;

    public SlightlyBetterCustomerDao() {
        customers = new HashMap<>();
    }

    @Override
    public void add(Customer customer) throws AlreadyExistsException {
        String nameToLower = customer.getName().toLowerCase();
        if (customers.containsKey(nameToLower)) {
            throw new AlreadyExistsException();
        }
        customers.put(nameToLower, customer);
    }

    @Override
    public void update(Customer customer) throws NotFoundException {
        if (!customers.containsKey(customer.getName().toLowerCase())) {
            throw new NotFoundException();
        }
        customers.put(customer.getName().toLowerCase(), customer);
    }

    public Customer remove(Customer customer) throws NotFoundException {
        if (!customers.containsKey(customer.getName().toLowerCase())) {
            throw new NotFoundException();
        }
        return customers.remove(customer.getName().toLowerCase());
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
