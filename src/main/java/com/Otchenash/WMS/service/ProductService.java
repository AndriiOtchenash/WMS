package com.Otchenash.WMS.service;

import com.Otchenash.WMS.entities.Product;
import com.Otchenash.WMS.repositories.ProductRepoisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepoisitory productRepoisitory;

    public Optional<Product> findById(Long id) {
        return productRepoisitory.findById( id );
    }

    public List<Product> findAll() {
        return productRepoisitory.findAll();
    }
}
