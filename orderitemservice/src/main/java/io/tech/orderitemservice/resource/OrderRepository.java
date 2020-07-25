package io.tech.orderitemservice.resource;

import org.springframework.data.repository.CrudRepository;

import io.tech.orderitemservice.entity.model.OrderItem;

public interface OrderRepository extends CrudRepository<OrderItem, Integer> {

}
