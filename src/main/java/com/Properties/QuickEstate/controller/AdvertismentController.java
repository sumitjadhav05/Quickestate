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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Properties.QuickEstate.entity.Advertisment;
import com.Properties.QuickEstate.service.AdvertismentService;

@RestController
public class AdvertismentController {

	@Autowired
	AdvertismentService advertismentService;
	
	@PostMapping("/advertisment")
	public Advertisment createAdvertisment(@RequestBody Advertisment advertisment) {
		return advertismentService.createAdvertisment(advertisment);
	}
	
	@GetMapping("/advertisment")
	public List<Advertisment> readAdvertisment() {
		return advertismentService.getDetails();
	}
	
	@GetMapping("/advertisment/{id}")
	public Optional<Advertisment> getDetailsById(@PathVariable Long id) {
		return advertismentService.getAdvertismentById(id);
	}
	
	@DeleteMapping("advertisment")
	public String deleteAdvertisment(@RequestParam Long id) {
		return advertismentService.deleteAdvertisment(id);
	}
	
	@PutMapping("/advertisment/{id}")
	public Advertisment updateAdvertisment(@RequestBody Advertisment advertisment,@PathVariable Long id) {
		return advertismentService.updateAdvertisment(advertisment ,id);
	}
}
