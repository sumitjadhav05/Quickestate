package com.Properties.QuickEstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Properties.QuickEstate.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long>{

}
