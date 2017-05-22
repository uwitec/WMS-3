package com.wms.entity;

/**
 * Material entity. @author MyEclipse Persistence Tools
 */

public class Material implements java.io.Serializable {

	// Fields

	private Integer id;
	private String materNum;
	private String name;
	private String furnace;
	private String rollNum;
	private String bundleNum;
	private Double length;
	private Double width;
	private Double high;
	private Integer amount;
	private Double weight;
	private String mark;
	private String factory;
	private String standard;
	private String surfaceTreatment;
	private String boundary;
	private String grade;
	private String proDate;
	private String packTeam;
	private String checker;
	private String rohs;
	private String remark;

	// Constructors

	/** default constructor */
	public Material() {
	}

	/** minimal constructor */
	public Material(Double high) {
		this.high = high;
	}

	/** full constructor */
	public Material(String materNum, String name, String furnace,
			String rollNum, String bundleNum, Double length, Double width,
			Double high, Integer amount, Double weight, String mark,
			String factory, String standard, String surfaceTreatment,
			String boundary, String grade, String proDate, String packTeam,
			String checker, String rohs, String remark) {
		this.materNum = materNum;
		this.name = name;
		this.furnace = furnace;
		this.rollNum = rollNum;
		this.bundleNum = bundleNum;
		this.length = length;
		this.width = width;
		this.high = high;
		this.amount = amount;
		this.weight = weight;
		this.mark = mark;
		this.factory = factory;
		this.standard = standard;
		this.surfaceTreatment = surfaceTreatment;
		this.boundary = boundary;
		this.grade = grade;
		this.proDate = proDate;
		this.packTeam = packTeam;
		this.checker = checker;
		this.rohs = rohs;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaterNum() {
		return this.materNum;
	}

	public void setMaterNum(String materNum) {
		this.materNum = materNum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFurnace() {
		return this.furnace;
	}

	public void setFurnace(String furnace) {
		this.furnace = furnace;
	}

	public String getRollNum() {
		return this.rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}

	public String getBundleNum() {
		return this.bundleNum;
	}

	public void setBundleNum(String bundleNum) {
		this.bundleNum = bundleNum;
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

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
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

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getProDate() {
		return this.proDate;
	}

	public void setProDate(String proDate) {
		this.proDate = proDate;
	}

	public String getPackTeam() {
		return this.packTeam;
	}

	public void setPackTeam(String packTeam) {
		this.packTeam = packTeam;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getRohs() {
		return this.rohs;
	}

	public void setRohs(String rohs) {
		this.rohs = rohs;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}