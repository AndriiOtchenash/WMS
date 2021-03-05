package com.Otchenash.WMS.repositories;

import com.Otchenash.WMS.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepoisitory extends JpaRepository<Product, Long> {

}
