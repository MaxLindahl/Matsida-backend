package com.matsida.backend;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.matsida.backend.sold_items;
import org.springframework.data.repository.query.Param;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface sold_itemsRepository extends CrudRepository<sold_items, Integer> {

    @Query("SELECT item " +
            "FROM sold_items item " +
            "WHERE item.user = :user")
    List<sold_items> getItemsByUser(@Param("user") String user);
}