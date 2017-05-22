package com.wms.entity;

/**
 * Clwrite entity. @author MyEclipse Persistence Tools
 */

public class Clwrite implements java.io.Serializable {

	// Fields

	private Integer id;
	private String plcname;
	private String writeValue;
	private String type;
	private String meaning;
	private String remark;

	// Constructors

	/** default constructor */
	public Clwrite() {
	}

	/** full constructor */
	public Clwrite(String plcname, String writeValue, String type,
			String meaning, String remark) {
		this.plcname = plcname;
		this.writeValue = writeValue;
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

	public String getWriteValue() {
		return this.writeValue;
	}

	public void setWriteValue(String writeValue) {
		this.writeValue = writeValue;
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