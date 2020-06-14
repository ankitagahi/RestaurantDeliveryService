package com.ankita.order.repository;

import com.ankita.order.entity.DeliveryPerson;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryPersonRepository extends CrudRepository<DeliveryPerson, Long> {
    DeliveryPerson findByMobileNo(String mobileNo);
}
