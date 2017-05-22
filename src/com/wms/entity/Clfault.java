package com.wms.entity;

/**
 * Clfault entity. @author MyEclipse Persistence Tools
 */

public class Clfault implements java.io.Serializable {

	// Fields

	private Integer id;
	private String code;
	private String meaning;
	private String remark;

	// Constructors

	/** default constructor */
	public Clfault() {
	}

	/** full constructor */
	public Clfault(String code, String meaning, String remark) {
		this.code = code;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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