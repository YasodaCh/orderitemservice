package io.tech.orderitemservice.exception;

@SuppressWarnings("serial")
public class OrderItemNotFoundRuntimeException extends RuntimeException {

	public OrderItemNotFoundRuntimeException(String message) {
		super(message);
	}
}
