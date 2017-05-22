package com.wms.entity;

/**
 * Clreturn entity. @author MyEclipse Persistence Tools
 */

public class Clreturn implements java.io.Serializable {

	// Fields

	private Integer id;
	private String plcname;
	private String readValue;
	private String type;
	private String meaning;
	private String remark;

	// Constructors

	/** default constructor */
	public Clreturn() {
	}

	/** minimal constructor */
	public Clreturn(String plcname, String readValue) {
		this.plcname = plcname;
		this.readValue = readValue;
	}

	/** full constructor */
	public Clreturn(String plcname, String readValue, String type,
			String meaning, String remark) {
		this.plcname = plcname;
		this.readValue = readValue;
		this.type = type;
		this.meaning = meaning;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlcname() {
		return this.plcname;
	}

	public void setPlcname(String plcname) {
		this.plcname = plcname;
	}

	public String getReadValue() {
		return this.readValue;
	}

	public void setReadValue(String readValue) {
		this.readValue = readValue;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMeaning() {
		return this.meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}