package com.cesta.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesta.apirest.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

		

}
