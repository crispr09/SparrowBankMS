package com.sparrowbank.orderservice.service;

import com.sparrowbank.orderservice.domain.Order;

public interface OrderService {
    public Order saveOrder(Order order);
}
