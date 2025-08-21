package com.aaslin.orderManagement.service;

import com.aaslin.orderManagement.entity.Product;
import com.aaslin.orderManagement.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService implements ProductServices {
	
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
    public Product addProduct(Product product) {
        product.setIsActive(true);
        product.setCreatedDate(LocalDateTime.now());
        product.setCreatedBy("");
        return productRepository.save(product);
    }

    @Override
    @Transactional(readOnly = true)
    public Product getProductById(int id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }

    @Override
    public Product updateProduct(int id, Product updatedProduct) {
        Product existing = getProductById(id);
        existing.setName(updatedProduct.getName());
        existing.setPrice(updatedProduct.getPrice());
        existing.setStock(updatedProduct.getStock());
        existing.setUpdatedDate(LocalDateTime.now());
        existing.setUpdatedBy("");
        return productRepository.save(existing);
    }

    @Override
    public void deleteProduct(int id) {
        Product existing = getProductById(id);
        existing.setIsActive(false);
        existing.setUpdatedDate(LocalDateTime.now());
        existing.setUpdatedBy("");
        productRepository.save(existing);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll().stream().filter(Product::isActive).toList();
    }
}