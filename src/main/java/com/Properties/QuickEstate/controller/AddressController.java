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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Properties.QuickEstate.entity.Address;
import com.Properties.QuickEstate.service.AddressService;

@RestController
@RequestMapping("/add")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/address")
	public Address createAddressDetails(@RequestBody Address address) {
	return addressService.AddressDetails(address);	
	}
	
	@GetMapping("/address")
    public List<Address> GetAllAddressDetails() {
		return addressService.getAddressDetails();
	}
	
	@GetMapping("/address/{id}")
	public Optional<Address> getAddressDetailsById(@PathVariable Long id){
		return addressService.getAddressById(id);
	}
	
	@DeleteMapping("/address")
	public String deleteAddressDetails(@RequestParam Address address) {
		return addressService.deleteAddress(address);
	}
	
	@PutMapping("/address/{id}")
	public Address updateAddressDetails(@RequestBody Address address, @PathVariable Long id) {
		return addressService.updateAddressDetails(address,id);
	}
}
