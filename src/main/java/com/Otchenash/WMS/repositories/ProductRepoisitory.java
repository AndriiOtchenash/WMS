package com.Otchenash.WMS.repositories;

import com.Otchenash.WMS.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepoisitory extends JpaRepository<Product, Long> {

//    @Override
//    List<Product> findAll();
//
//    @Override
//    List<Product> findAllById(Iterable<Long> longs);

}
