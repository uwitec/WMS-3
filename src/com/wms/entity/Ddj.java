package com.wms.entity;

/**
 * Ddj entity. @author MyEclipse Persistence Tools
 */

public class Ddj implements java.io.Serializable {

	// Fields

	private Integer id;
	private String plcname;
	private String value;

	// Constructors

	/** default constructor */
	public Ddj() {
	}

	/** full constructor */
	public Ddj(String plcname, String value) {
		this.plcname = plcname;
		this.value = value;
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}