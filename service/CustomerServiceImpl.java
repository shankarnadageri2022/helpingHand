package com.evehiclemanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evehiclemanagementsystem.entity.Customer;
import com.evehiclemanagementsystem.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		Customer newCustomer=customerRepository.save(customer);
		return newCustomer;
	}

	@Override
	public Customer getById(int customerId) {
		Optional<Customer> customerById=customerRepository.findById(customerId);
		Customer customer=customerById.get();
		return customer ;
	}
	

	

}
