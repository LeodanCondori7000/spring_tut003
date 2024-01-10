package com.leodan.springboot.di.app.springbootdi2.repositories;

import java.util.List;

import com.leodan.springboot.di.app.springbootdi2.models.Product;

public interface ProductRepository {
  List<Product> findAll();

  Product findById(Long id);
}
