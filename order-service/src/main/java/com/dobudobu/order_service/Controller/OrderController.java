package com.dobudobu.order_service.Controller;

import com.dobudobu.order_service.Dto.Request.OrderRequest;
import com.dobudobu.order_service.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(
            value = "/order-product",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public String orderThings(@RequestBody OrderRequest orderRequest){
        orderService.createOrder(orderRequest);
        return "Successfully order";

    }

}
