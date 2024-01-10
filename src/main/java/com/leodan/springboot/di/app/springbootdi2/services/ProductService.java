package com.leodan.springboot.di.app.springbootdi2.services;

import java.util.List;

import com.leodan.springboot.di.app.springbootdi2.models.Product;

public interface ProductService {

  List<Product> findAll();

  Product findById(Long id);
}
