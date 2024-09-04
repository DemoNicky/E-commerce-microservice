package com.dobudobu.order_service.Service;

import com.dobudobu.order_service.Dto.Request.OrderRequest;

public interface OrderService {
    void createOrder(OrderRequest orderRequest);
}
