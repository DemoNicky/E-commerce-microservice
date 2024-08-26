package com.dobudobu.product_service.Dto.Request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductRequest {

    private String productName;

    private String description;

    private BigDecimal price;

}
