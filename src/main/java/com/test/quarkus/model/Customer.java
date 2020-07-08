package com.test.quarkus.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Customer extends PanacheEntity {

	long custId;
	String custName;
	String address;
	String kycType;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getKycType() {
		return kycType;
	}
	public void setKycType(String kycType) {
		this.kycType = kycType;
	}
	
}
