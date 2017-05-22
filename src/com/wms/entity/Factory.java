package com.wms.entity;

/**
 * Factory entity. @author MyEclipse Persistence Tools
 */

public class Factory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String factoryId;
	private String factory;
	private String address;
	private String tel;
	private String linkName;

	// Constructors

	/** default constructor */
	public Factory() {
	}

	/** full constructor */
	public Factory(String factoryId, String factory, String address,
			String tel, String linkName) {
		this.factoryId = factoryId;
		this.factory = factory;
		this.address = address;
		this.tel = tel;
		this.linkName = linkName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFactoryId() {
		return this.factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getLinkName() {
		return this.linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

}