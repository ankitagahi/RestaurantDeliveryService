package com.ankita.order.repository;

import com.ankita.order.entity.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findByItemIdIn(List<String> itemIds);
}
