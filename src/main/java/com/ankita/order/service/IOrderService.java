package com.ankita.order.service;

import com.ankita.order.model.request.OrderRequest;
import com.ankita.order.model.request.OrderStatusUpdateRequest;
import com.ankita.order.model.response.OrderResponse;
import com.ankita.order.model.response.OrderStatusUpdateResponse;

public interface IOrderService {

    OrderResponse orderPlace(OrderRequest orderRequest);

    OrderStatusUpdateResponse getOrderStatus(String orderId);

    OrderStatusUpdateResponse updateStatus(OrderStatusUpdateRequest request);
}
