package com.sda.testingbasics.db;

import java.util.Collection;

public interface CustomerDao {

    /**
     * Adds customer to database
     * @param customer to add
     * @throws AlreadyExistsException when a customer with the same name already exists
     */
    void add(Customer customer) throws AlreadyExistsException;

    /**
     * Updates the customer by name
     * @param customer to update
     * @throws NotFoundException when there is no customer with such name
     */
    void update(Customer customer) throws NotFoundException;

    /**
     * Removes customer from database
     * @param customer a customer to remove
     * @return removed Customer
     * @throws NotFoundException when there is no customer with such name
     */
    Customer remove(Customer customer) throws NotFoundException;

    /**
     * Finds customer by name
     * @param name used for search, case insensitive
     * @return a Customer with given name if exists or null otherwise
     */
    Customer find(String name);

    /**
     * Gets all customers from the database
     * @return an unsorted collection of customers or an empty list
     */
    Collection<Customer> getAll();
}
