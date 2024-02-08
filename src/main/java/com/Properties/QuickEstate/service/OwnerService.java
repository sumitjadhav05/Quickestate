package com.Properties.QuickEstate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Properties.QuickEstate.entity.Advertisment;
import com.Properties.QuickEstate.entity.Owner;
import com.Properties.QuickEstate.entity.Property;
import com.Properties.QuickEstate.repository.OwnerRepository;

@Service
public class OwnerService {

	@Autowired
	OwnerRepository ownerRepository;
	PropertyService propertyService;
	
	public Owner createDetails(Owner owner) {
		
		return ownerRepository.save(owner);
	}

	public List<Owner> getDetailsOfOwner() {
		return ownerRepository.findAll();
	}

	public Owner findOwnerWithPropertyById(Long id) {
		List<Property> props=propertyService.getPropertyDetails();
		
		Optional<Owner> opOwner=ownerRepository.findById(id);
		Owner owner=null;
		
	     if(opOwner.isPresent()) {
			owner=opOwner.get();
		}
		List<Property> customProp=new ArrayList<>();
		for(Property prop:props) {
			if(prop.getOwner().getId()==id) {
				customProp.add(prop);
				owner.setProperty(customProp);
			}
		}
		return owner;
	}

	public String DeleteOwnerDetails(Long id) {
		ownerRepository.findById(id);
		return "Deletion Successfully";
	}

	public Owner updateOwnerDetails(Owner owner, Long id) {
	List<Advertisment> ads=owner.getAdvertisment();
	
	Optional<Owner> ownerop=ownerRepository.findById(id);
	
	Owner ownerDb=ownerop.get();
	ownerDb.setAdvertisment(ads);
		return ownerRepository.save(ownerDb);
	}



}
