package com.wms.entity;

/**
 * WoodPallet entity. @author MyEclipse Persistence Tools
 */

public class WoodPallet implements java.io.Serializable {

	// Fields

	private Integer id;
	private String warehouse;
	private Double length;
	private Double width;
	private String materNum;
	private String state;

	// Constructors

	/** default constructor */
	public WoodPallet() {
	}

	/** full constructor */
	public WoodPallet(String warehouse, Double length, Double width,
			String materNum, String state) {
		this.warehouse = warehouse;
		this.length = length;
		this.width = width;
		this.materNum = materNum;
		this.state = state;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(String string) {
		this.warehouse = string;
	}

	public Double getLength() {
		return this.length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return this.width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public String getMaterNum() {
		return this.materNum;
	}

	public void setMaterNum(String materNum) {
		this.materNum = materNum;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}