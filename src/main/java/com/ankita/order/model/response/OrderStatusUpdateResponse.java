package com.ankita.order.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ankita.order.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderStatusUpdateResponse extends BaseResponse {
    private OrderStatus status;
}
