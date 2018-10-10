package com.capgemini.orderapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.orderapp.entity.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
