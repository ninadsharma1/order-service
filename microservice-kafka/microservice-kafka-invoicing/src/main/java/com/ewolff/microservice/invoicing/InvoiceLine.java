package com.ewolff.microservice.invoicing;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class InvoiceLine {

	@Column(name = "F_COUNT")
	private int count;

	@Embedded
	private Item item;

	@Id
	@GeneratedValue
	private long id;

	public void setCount(int count) {
		this.count = count;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public InvoiceLine() {
	}

	public InvoiceLine(int count, Item item) {
		this.count = count;
		this.item = item;
	}

	public int getCount() {
		return count;
	}

	public Item getItem() {
		return item;
	}

	public double totalAmount() {
		return getCount() * getItem().getPrice();
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
