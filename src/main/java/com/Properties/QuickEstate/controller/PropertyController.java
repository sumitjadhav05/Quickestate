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

import com.Properties.QuickEstate.entity.Property;
import com.Properties.QuickEstate.service.PropertyService;

@RestController
@RequestMapping("/prop")
public class PropertyController {

	@Autowired
	PropertyService propertyService;
	
	@PostMapping("/property")
	public Property createPropertyDetails(@RequestBody Property property) {
		return propertyService.createPropertyDetails(property);
	}
	
	@GetMapping("/property")
	public List<Property> getPropertyDetails() {
		return propertyService.getPropertyDetails();
	}
	
	@GetMapping("/property/{id}")
	public Optional<Property> getPropertyDetailsById(@PathVariable Long id) {
		return propertyService.getPropertyById(id);
	}
	
	@DeleteMapping("/property")
	public String deletePropertyDetails(@RequestParam Long id) {
		return propertyService.deletePropertyDetails(id);
	}
	
	@PutMapping("/property/{id}")
	public Property updatePropertyDetails(@RequestBody Property property, @PathVariable Long id) {
		return propertyService.updatePropertyDetails(property,id);
	}
}
