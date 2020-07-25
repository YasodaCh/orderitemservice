package io.tech.orderitemservice.serviceImpl;

import org.springframework.stereotype.Service;

import io.tech.orderitemservice.entity.model.OrderItem;
import io.tech.orderitemservice.entity.response.OrderItemsResponse;

@Service
public interface OrderAPIService {

	public void saveOrUpdate(OrderItem orderData);

	public OrderItemsResponse getOrderById(int orderId);

}
