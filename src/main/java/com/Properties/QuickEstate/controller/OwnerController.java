package com.Properties.QuickEstate.controller;

import java.util.List;

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

import com.Properties.QuickEstate.entity.Owner;
import com.Properties.QuickEstate.service.OwnerService;

@RestController
@RequestMapping("/own")
public class OwnerController {

	@Autowired
	OwnerService ownerService;
	
	@PostMapping("/owner")
	public Owner createOwnerDetails(@RequestBody Owner owner) {
		return ownerService.createDetails(owner);
	}
	
	@GetMapping("/owner")
	public List<Owner> getOwnerDetails(){
		return ownerService.getDetailsOfOwner();
	}
	
	@GetMapping("/owner/{id}")
	public Owner getOwnerDetailsById(@PathVariable Long id) {
		return ownerService.findOwnerWithPropertyById(id);
	}
	
	@DeleteMapping("/owner")
	public String deleteOwnerDetails(@RequestParam Long id) {
		return ownerService.DeleteOwnerDetails( id);
	}
	
	@PutMapping("owner/{id}")
	public Owner updateOwnerDetails(@RequestBody Owner owner, @PathVariable Long id) {
		return ownerService.updateOwnerDetails(owner,id);
	}
}
