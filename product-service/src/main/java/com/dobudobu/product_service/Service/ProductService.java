package com.dobudobu.product_service.Service;

import com.dobudobu.product_service.Dto.Request.ProductRequest;
import com.dobudobu.product_service.Dto.Response.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProduct();
}
