package com.ankita.order.repository;


import com.ankita.order.entity.Order;
import com.ankita.order.enums.OrderStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
    Order findByOrderId(String orderId);

    Order findByOrderIdAndDeliveryPersonMobileNo(String orderId, String mobileNo);

    Order findByStatusNotAndDeliveryPersonMobileNo(OrderStatus status, String mobileNo);
}
