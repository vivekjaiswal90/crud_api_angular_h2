package com.princekr.springdemo.service;

import java.util.List;

import com.princekr.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
