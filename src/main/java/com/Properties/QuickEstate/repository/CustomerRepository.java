package com.Properties.QuickEstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Properties.QuickEstate.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
