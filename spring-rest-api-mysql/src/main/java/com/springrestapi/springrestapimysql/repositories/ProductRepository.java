package com.springrestapi.springrestapimysql.repositories;

import com.springrestapi.springrestapimysql.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
    Products findByName(String name);
}
