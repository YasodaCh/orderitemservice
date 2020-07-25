package io.tech.orderitemservice.entity.response;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class OrderItemResp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 54387845536586289L;
	String msg;
	String respCd;

	public OrderItemResp() {
	}

	public OrderItemResp(String msg, String respCd) {
		this.msg = msg;
		this.respCd = respCd;
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
