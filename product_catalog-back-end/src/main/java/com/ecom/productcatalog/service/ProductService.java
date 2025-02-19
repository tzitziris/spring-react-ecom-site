package com.ecom.productcatalog.service;


import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //    @Transactional(readOnly = true)  // ✅ Use the correct import
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //    @Transactional(readOnly = true)
    public List<Product> getProductsByCategory(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}