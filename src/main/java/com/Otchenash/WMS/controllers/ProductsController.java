package com.Otchenash.WMS.controllers;

import com.Otchenash.WMS.entities.Product;
import com.Otchenash.WMS.service.ProductService;
import com.Otchenash.WMS.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {

        this.productService = productService;
    }

    Logger logger = LoggerFactory.getLogger(UsersController.class);
    private UserService userService;

    @GetMapping("products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("products/{id}")
    public Optional<Product> findById(@PathVariable("id") Long id) {
        return productService.findById( id );
    }

    @PostMapping("products")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct( product );
    }

    @DeleteMapping("products/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct( id );

    }
    @DeleteMapping("products")
    public void deleteAll() {
        productService.deleteAll();
    }

}

