package com.Properties.QuickEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Properties.QuickEstate.entity.Address;
import com.Properties.QuickEstate.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	public Address AddressDetails(Address address) {
		return addressRepository.save(address);
	}
	
	public List<Address> getAddressDetails() {
		return addressRepository.findAll();
	}
	
	public Optional<Address> getAddressById(Long id){
		return addressRepository.findById(id);
	}
	
	public String deleteAddress(Address address) {
		addressRepository.deleteAll();
		return "Deletion Successfully";
	}
	
	public Address updateAddressDetails(Address currentAddress ,Long id) {
		Address address =addressRepository.findById(id).get();
		if(address.getAddress1()!=null) {
			address.setAddress1(currentAddress.getAddress1());
		}
		if(address.getAddress2()!=null) {
			address.setAddress2(currentAddress.getAddress2());
		}
		return addressRepository.save(address);
	}
}
