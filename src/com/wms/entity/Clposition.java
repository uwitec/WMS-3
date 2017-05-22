package com.wms.entity;

/**
 * Clposition entity. @author MyEclipse Persistence Tools
 */

public class Clposition implements java.io.Serializable {

	// Fields

	private Integer id;
	private String meaning;

	// Constructors

	/** default constructor */
	public Clposition() {
	}

	/** full constructor */
	public Clposition(String meaning) {
		this.meaning = meaning;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMeaning() {
		return this.meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

}