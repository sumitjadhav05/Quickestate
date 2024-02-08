package com.Properties.QuickEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Properties.QuickEstate.entity.Property;
import com.Properties.QuickEstate.repository.PropertyRepository;

@Service
public class PropertyService {
	@Autowired
	PropertyRepository propertRepository;

	public Property createPropertyDetails(Property property) {
		return propertRepository.save(property);
	}

	public List<Property> getPropertyDetails() {
		return propertRepository.findAll();
	}

	public Optional<Property> getPropertyById(Long id) {
		return propertRepository.findById(id);
	}

	public String deletePropertyDetails(Long id) {
		 propertRepository.findById(id);
		 return "Deletion Successfully";
	}

	public Property updatePropertyDetails(Property currentproperty, Long id) {
		Property property=propertRepository.findById(id).get();
		if(property.getAddress()!=null) {
			property.setAddress(currentproperty.getAddress());
		}
		if(property.getStatus()!=null) {
			property.setStatus(currentproperty.getStatus());
		}
		if(property.getAdvertisment()!=null) {
			property.setAdvertisment(currentproperty.getAdvertisment());
		}
		return propertRepository.save(property);
	}

}
