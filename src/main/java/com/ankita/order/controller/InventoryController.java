package com.ankita.order.controller;

import com.ankita.order.entity.Item;
import com.ankita.order.model.request.AddNewAgentRequest;
import com.ankita.order.model.request.AddUserRequest;
import com.ankita.order.model.response.BaseResponse;
import com.ankita.order.service.IInventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/inventory")
@Slf4j
public class InventoryController {

    private final IInventoryService inventoryService;

    public InventoryController(IInventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    /**
     * apit to add new item
     * @param userId
     * @param item
     * @return
     */
    @PostMapping("/item")
    public ResponseEntity<BaseResponse> addItem(@RequestHeader String userId,
            @Valid @RequestBody Item item) {
        log.info("inventory addition request : " + item);
        return ResponseEntity.ok().body(inventoryService.addItem(item));
    }

    /**
     * api to get all items list
     * @param userId
     * @return
     */
    @GetMapping("/item")
    public ResponseEntity<List<Item>> getAllItems(@RequestHeader String userId) {
        return ResponseEntity.ok().body(inventoryService.getAllItems());
    }

    /**
     * api to add delivery agent
     * @param userId
     * @param request
     * @return
     */
    @PostMapping("/agent")
    public ResponseEntity<BaseResponse> addDeliveryPerson(@RequestHeader String userId,
            @Valid @RequestBody AddNewAgentRequest request) {
        log.info("request to add delivery boy : " + request);
        return ResponseEntity.ok().body(inventoryService.addDeliveryPerson(request));
    }

    /**
     * api to add new user
     * @param userId
     * @param request
     * @return
     */
    @PostMapping("/user")
    public ResponseEntity<BaseResponse> addUser(@RequestHeader String userId,
            @Valid @RequestBody AddUserRequest request) {
        log.info("request to add user : " + request);
        return ResponseEntity.ok().body(inventoryService.addUser(request));
    }
}
