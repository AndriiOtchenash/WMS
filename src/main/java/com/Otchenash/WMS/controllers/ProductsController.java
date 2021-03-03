package com.Otchenash.WMS.controllers;

import com.Otchenash.WMS.entities.Product;
import com.Otchenash.WMS.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    private ProductService productService;

    @GetMapping("products")
    public List<Product> findAll() {
        return productService.findAll();
    }
}

