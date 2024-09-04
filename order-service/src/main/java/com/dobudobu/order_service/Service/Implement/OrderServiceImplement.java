package com.dobudobu.order_service.Service.Implement;

import com.dobudobu.order_service.Dto.Request.OrderListRequest;
import com.dobudobu.order_service.Dto.Request.OrderRequest;
import com.dobudobu.order_service.Entity.Order;
import com.dobudobu.order_service.Entity.OrderLineItems;
import com.dobudobu.order_service.Repository.OrderRepository;
import com.dobudobu.order_service.Service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderServiceImplement implements OrderService {

    private OrderRepository orderRepository;

    @Override
    public void createOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderListRequests()
                .stream().map(orderLineItemsDto -> mapToDto(orderLineItemsDto)).collect(Collectors.toList());

        order.setOrderLineItems(orderLineItems);
        orderRepository.save(order);
    }

    private OrderLineItems mapToDto(OrderListRequest orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItems.getQuantity());
        orderLineItems.setSkuCode(orderLineItems.getSkuCode());
        return orderLineItems;
    }
}
