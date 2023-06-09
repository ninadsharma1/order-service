package com.ewolff.microservice.invoicing;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Item {

	@Column(nullable = false)
	private Long itemId;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private double price;

	public Item() {
		super();
		itemId = 0l;
	}

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long id) {
		this.itemId = id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);

	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}
