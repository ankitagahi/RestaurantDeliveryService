package com.ankita.order.controller;

import com.ankita.order.model.request.OrderRequest;
import com.ankita.order.model.request.OrderStatusUpdateRequest;
import com.ankita.order.model.response.OrderResponse;
import com.ankita.order.model.response.OrderStatusUpdateResponse;
import com.ankita.order.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    private final IOrderService IOrderService;

    public OrderController(IOrderService IOrderService) {
        this.IOrderService = IOrderService;
    }

    /**
     * Api to place a new order
     * @param userId
     * @param request
     * @return
     */
    @PostMapping("/place")
    public ResponseEntity<OrderResponse> orderPlace(@RequestHeader String userId,
            @Valid @RequestBody OrderRequest request) {
        return ResponseEntity.ok().body(IOrderService.orderPlace(request));
    }

    /**
     * Api to fetch delivery status
     *  to be used by user or admin
     * @param userId
     * @param orderId
     * @return
     */
    @GetMapping("/status")
    public ResponseEntity<OrderStatusUpdateResponse> getOrderStatus(@RequestHeader String userId,
            @RequestParam String orderId) {
        return ResponseEntity.ok().body(IOrderService.getOrderStatus(orderId));
    }

    /**
     * Api to update order status
     * to be used by delivery agent.
     * @param userId
     * @param request
     * @return
     */
    @PutMapping("/status")
    public ResponseEntity<OrderStatusUpdateResponse> updateStatus(@RequestHeader String userId,
            @Valid @RequestBody OrderStatusUpdateRequest request) {
        return ResponseEntity.ok().body(IOrderService.updateStatus(request));
    }

}
