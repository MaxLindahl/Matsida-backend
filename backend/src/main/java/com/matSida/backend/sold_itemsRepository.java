package com.matsida.backend;

import org.springframework.data.repository.CrudRepository;

import com.matsida.backend.sold_items;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface sold_itemsRepository extends CrudRepository<sold_items, Integer> {

}