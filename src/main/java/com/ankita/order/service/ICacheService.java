package com.ankita.order.service;

import com.ankita.order.entity.Order;

public interface ICacheService {
    void saveOrder(Order order);

    Order fetchOrder(String orderId);
}
