package io.tech.orderitemservice.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tech.orderitemservice.entity.model.OrderItem;
import io.tech.orderitemservice.entity.response.OrderItemResp;
import io.tech.orderitemservice.entity.response.OrderItemsResponse;
import io.tech.orderitemservice.serviceImpl.OrderAPIService;

@RestController
@RequestMapping("/api")
public class OrderItemServiceController {
	static Logger logger = LoggerFactory.getLogger(OrderItemServiceController.class);

	@Autowired
	OrderAPIService orderAPIService;

	@GetMapping("/healthcheck")
	public String getHealthCheck() {
		logger.info("Message logged at order item service healthcheck !!!");
		return "I am available!!!";
	}

	@PostMapping("/orderitem/save")
	public OrderItemResp saveOrderItem(@Valid @RequestBody OrderItem order) {
		orderAPIService.saveOrUpdate(order);
		OrderItemResp item = new OrderItemResp();
		item.setMsg("Success");
		item.setRespCd("200");
		return item;
	}

	@GetMapping("/orderitem/{id}")
	public OrderItemsResponse getOrderItem(@PathVariable("id") int id) {
		return orderAPIService.getOrderById(id);
	}
}
