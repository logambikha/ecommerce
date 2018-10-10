package com.capgemini.orderapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.orderapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
