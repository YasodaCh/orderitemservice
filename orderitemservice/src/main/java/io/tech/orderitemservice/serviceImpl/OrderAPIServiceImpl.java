package io.tech.orderitemservice.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.tech.orderitemservice.entity.model.OrderItem;
import io.tech.orderitemservice.entity.response.OrderItemsResponse;
import io.tech.orderitemservice.exception.OrderItemNotFoundException;
import io.tech.orderitemservice.resource.OrderRepository;

@Service
public class OrderAPIServiceImpl implements OrderAPIService {
	static Logger logger = LoggerFactory.getLogger(OrderAPIServiceImpl.class);
	@Autowired
	OrderRepository orderRepository;

	@Override
	public void saveOrUpdate(OrderItem orderData) {
		orderRepository.save(orderData);
	}

	@Override
	public OrderItemsResponse getOrderById(int orderId) {
		OrderItemsResponse orderItemResp = new OrderItemsResponse();
		OrderItem orderItem = null;
		try {
			orderItem = orderRepository.findOne(orderId);

			if (orderItem != null) {
				orderItemResp.setOrderItem(orderItem);
				orderItemResp.setMsg("Success");
				orderItemResp.setRespCd("200");
			} else {
				orderItemResp.setOrderItem(orderItem);
				orderItemResp.setMsg("Order Item is not found for the id " + orderId);
				orderItemResp.setRespCd("400");
				throw new OrderItemNotFoundException("Order Item is not found for the id " + orderId);
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
		}

		return orderItemResp;

	}
}
