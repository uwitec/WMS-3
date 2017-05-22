package com.wms.entity;

/**
 * Standard entity. @author MyEclipse Persistence Tools
 */

public class Standard implements java.io.Serializable {

	// Fields

	private Integer id;
	private String standard;
	private String name;
	private String grade;
	private Double length;
	private Double width;
	private Double high;
	private Integer amount;
	private Double weight;
	private String surfaceTreatment;
	private String boundary;
	private String factory;
	private String remark;

	// Constructors

	/** default constructor */
	public Standard() {
	}

	/** full constructor */
	public Standard(String standard, String name, String grade, Double length,
			Double width, Double high, Integer amount, Double weight,
			String surfaceTreatment, String boundary, String factory,
			String remark) {
		this.standard = standard;
		this.name = name;
		this.grade = grade;
		this.length = length;
		this.width = width;
		this.high = high;
		this.amount = amount;
		this.weight = weight;
		this.surfaceTreatment = surfaceTreatment;
		this.boundary = boundary;
		this.factory = factory;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public Double getHigh() {
		return this.high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getSurfaceTreatment() {
		return this.surfaceTreatment;
	}

	public void setSurfaceTreatment(String surfaceTreatment) {
		this.surfaceTreatment = surfaceTreatment;
	}

	public String getBoundary() {
		return this.boundary;
	}

	public void setBoundary(String boundary) {
		this.boundary = boundary;
	}

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}