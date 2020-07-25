package io.tech.orderitemservice.entity.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table
public class OrderItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1699570052387412221L;
	@Id
	@Column
	private int id;
	@Column
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	String productCode;
	@Column
	@Pattern(regexp = "^[a-zA-Z]*$")
	String productName;
	@Column
	@Pattern(regexp = "[0-9]+")
	String quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
