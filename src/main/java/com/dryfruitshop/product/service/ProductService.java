package com.dryfruitshop.product.service;

import com.dryfruitshop.product.model.Product;
import com.dryfruitshop.product.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
          return productRepository.findAll();
    }
    public Product saveProduct(Product product){
         return productRepository.save(product);
    }
}
