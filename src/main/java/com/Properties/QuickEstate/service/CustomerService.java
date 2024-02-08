package com.Properties.QuickEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Properties.QuickEstate.entity.Customer;
import com.Properties.QuickEstate.repository.CustomerRepository;

@Service
public class CustomerService {
	
	
	@Autowired
	CustomerRepository customerRepository;
		
	public Customer createCustommer(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> getAllCustommer() {
		return customerRepository.findAll();
	}

	public String deleteCustommer(Long id) {
		 customerRepository.findById(id);
		 return "Deletion successsfully";
	}

	public Customer updateCustomer(Customer cust, Long id) {
		Customer customer =customerRepository.findById(id).get();
		if(customer.getAddress()!=null) {
			customer.setAddress(cust.getAddress());
		}
		return customerRepository.save(customer);
	}

	public Optional<Customer> getCustomerDetails(Long id) {
		return customerRepository.findById(id);
	}
}
