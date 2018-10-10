package com.capgemini.orderapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.orderapp.entity.LineItem;

public interface LineItemRepository extends MongoRepository<LineItem, Integer> {

}
