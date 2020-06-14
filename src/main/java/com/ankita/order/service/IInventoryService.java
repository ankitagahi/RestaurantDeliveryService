package com.ankita.order.service;

import com.ankita.order.entity.Item;
import com.ankita.order.entity.User;
import com.ankita.order.model.request.AddNewAgentRequest;
import com.ankita.order.model.request.AddUserRequest;
import com.ankita.order.model.response.BaseResponse;

import java.util.List;

public interface IInventoryService {

    BaseResponse addItem(Item item);

    List<Item> getAllItems();

    BaseResponse addUser(AddUserRequest user);

    User ValidateUser(AddUserRequest request);

    BaseResponse addDeliveryPerson(AddNewAgentRequest request);
}
