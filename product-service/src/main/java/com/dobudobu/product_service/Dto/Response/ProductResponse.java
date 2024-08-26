package com.dobudobu.product_service.Dto.Response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductResponse {

    private String id;

    private String productName;

    private String description;

    private BigDecimal price;

}
