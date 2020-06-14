package com.ankita.order.service;

import com.ankita.order.model.request.OrderAssignRequest;
import com.ankita.order.model.response.AgentStatusResponse;
import com.ankita.order.model.response.AllAgentStatusResponse;
import com.ankita.order.model.response.OrderAssignResponse;

public interface IAdminService {
    OrderAssignResponse assignOrder(OrderAssignRequest request);

    AgentStatusResponse getPersonStatus(String mobileNo);

    AllAgentStatusResponse getAllAgentsStatus();
}
