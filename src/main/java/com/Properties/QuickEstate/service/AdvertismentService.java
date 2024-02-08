package com.Properties.QuickEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Properties.QuickEstate.entity.Advertisment;
import com.Properties.QuickEstate.repository.AdvertismentRepository;

@Service
public class AdvertismentService {

	@Autowired
	AdvertismentRepository advertismentRepository;

	public Advertisment createAdvertisment(Advertisment advertisment) {
		return advertismentRepository.save(advertisment);
	}

	public List<Advertisment> getDetails() {
		return advertismentRepository.findAll();
	}

	public Optional<Advertisment> getAdvertismentById(Long id) {
		return advertismentRepository.findById(id);
	}

	public String deleteAdvertisment(Long id) {
		advertismentRepository.findById(id);
		return "Deleted Successfully";
	}

	public Advertisment updateAdvertisment(Advertisment Curadvertisment, Long id) {
		Advertisment advertisment=advertismentRepository.findById(id).get();
		return advertismentRepository.save(advertisment);
	}
	
	

}
