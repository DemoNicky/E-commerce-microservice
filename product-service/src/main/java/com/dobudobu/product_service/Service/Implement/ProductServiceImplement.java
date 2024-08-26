package com.dobudobu.product_service.Service.Implement;

import com.dobudobu.product_service.Dto.Request.ProductRequest;
import com.dobudobu.product_service.Dto.Response.ProductResponse;
import com.dobudobu.product_service.Entity.Product;
import com.dobudobu.product_service.Repository.ProductRepository;
import com.dobudobu.product_service.Service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImplement implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .productName(productRequest.getProductName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("product created");
    }

    @Override
    public List<ProductResponse> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> mapToProductResponse(product)).toList();
    }

    private ProductResponse mapToProductResponse(Product products) {
        return ProductResponse.builder()
                .id(products.getId())
                .productName(products.getProductName())
                .description(products.getDescription())
                .price(products.getPrice())
                .build();
    }


}
