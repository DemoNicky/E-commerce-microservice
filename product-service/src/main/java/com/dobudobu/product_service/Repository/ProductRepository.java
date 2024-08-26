package com.dobudobu.product_service.Repository;

import com.dobudobu.product_service.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String > {
}
