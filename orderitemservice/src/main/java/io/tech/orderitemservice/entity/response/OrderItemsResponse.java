package io.tech.orderitemservice.entity.response;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import io.tech.orderitemservice.entity.model.OrderItem;

@Component
public class OrderItemsResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4853280887890740797L;
	OrderItem orderItem;
	String msg;
	String respCd;

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRespCd() {
		return respCd;
	}

	public void setRespCd(String respCd) {
		this.respCd = respCd;
	}

}
