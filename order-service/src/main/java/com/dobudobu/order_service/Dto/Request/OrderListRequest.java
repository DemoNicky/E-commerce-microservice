package com.dobudobu.order_service.Dto.Request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderListRequest {

    private String id;

    private String skuCode;

    private BigDecimal price;

    private Integer quantity;

}
