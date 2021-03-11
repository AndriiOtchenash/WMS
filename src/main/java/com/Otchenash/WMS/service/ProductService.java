package com.Otchenash.WMS.service;

import com.Otchenash.WMS.entities.Product;
import com.Otchenash.WMS.repositories.ProductRepoisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepoisitory productRepoisitory;

    @Autowired
    public ProductService(ProductRepoisitory productRepoisitory) {
        this.productRepoisitory = productRepoisitory;
    }

    public List<Product> findAll() {
        return productRepoisitory.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepoisitory.findById( id );
    }

    public Product saveProduct(Product product) {
        Date newCreatedDate = new Date(  );
        product.setCreatedDate( newCreatedDate);
        return productRepoisitory.save( product );
    }

    public void deleteProduct(Long id) {
        productRepoisitory.deleteById( id );
    }

    public void deleteAll() {
        productRepoisitory.deleteAll();
    }

}
