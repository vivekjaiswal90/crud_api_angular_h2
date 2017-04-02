package com.princekr.springdemo.dao;

import java.util.List;

import com.princekr.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
