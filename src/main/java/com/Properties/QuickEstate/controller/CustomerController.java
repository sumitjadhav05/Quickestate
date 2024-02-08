package com.Properties.QuickEstate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Properties.QuickEstate.entity.Customer;
import com.Properties.QuickEstate.service.CustomerService;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer createCustomerDetails(@RequestBody Customer customer) {
		return customerService.createCustommer(customer);
	}
	
	@GetMapping("/customer")
	private List<Customer> getAllEmployees() {
		return customerService.getAllCustommer();
	}

	@DeleteMapping("customer/{id}")
	private String deleteCustomer(@PathVariable Long id) {
		return customerService.deleteCustommer(id);
		
	}

	@PutMapping("customer/{id}")
	private Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
		return customerService.updateCustomer(customer, id);

	}
	
	@GetMapping("/customer/{id}")
	private Optional<Customer> getCustomerDetailsById(@PathVariable Long id) {
		return customerService.getCustomerDetails(id);
	}

}
