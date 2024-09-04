package com.dobudobu.order_service.Dto.Request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderRequest {

    private List<OrderListRequest> orderListRequests;

}
