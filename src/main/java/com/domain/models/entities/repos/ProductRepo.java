package com.domain.models.entities.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long>{

    List<Product> findByNameContains(String name);
    
}
