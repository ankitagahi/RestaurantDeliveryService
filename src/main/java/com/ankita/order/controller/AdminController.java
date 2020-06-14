package com.ankita.order.controller;

import com.ankita.order.model.request.OrderAssignRequest;
import com.ankita.order.model.response.AgentStatusResponse;
import com.ankita.order.model.response.AllAgentStatusResponse;
import com.ankita.order.model.response.OrderAssignResponse;
import com.ankita.order.service.IAdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {
    @Autowired
    private final IAdminService adminService;

    public AdminController(IAdminService adminService) {
        this.adminService = adminService;
    }

    /**
     * Api  to assign order
     * @param userId
     * @param request
     * @return
     */
    @PostMapping("/order/assign")
    public ResponseEntity<OrderAssignResponse> assignOrder(@RequestHeader String userId,
            @Valid @RequestBody OrderAssignRequest request) {
        return ResponseEntity.ok().body(adminService.assignOrder(request));
    }

    /**
     * to fetch delivery agent status
     * @param userId
     * @param agentId
     * @return
     */
    @GetMapping("/agent/status")
    public ResponseEntity<AgentStatusResponse> getStatus(@RequestHeader String userId,
            @RequestParam String agentId) {
        return ResponseEntity.ok().body(adminService.getPersonStatus(agentId));
    }

    /**
     * //to get status of all delivery agents
     * @param userId
     * @return
     */
    @GetMapping("/agent/status/all")
    public ResponseEntity<AllAgentStatusResponse> getStatus(@RequestHeader String userId) {
        return ResponseEntity.ok().body(adminService.getAllAgentsStatus());
    }
}
