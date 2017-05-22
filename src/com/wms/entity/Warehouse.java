package com.wms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Warehouse entity. @author MyEclipse Persistence Tools
 */

public class Warehouse implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer state;
	private Integer row;
	private Integer line;
	private Integer floor;
	private String remark;

	// Constructors

	/** default constructor */
	public Warehouse() {
	}

	/** full constructor */
	public Warehouse(Integer state, Integer row, Integer line, Integer floor,
			String remark) {
		this.state = state;
		this.row = row;
		this.line = line;
		this.floor = floor;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getRow() {
		return this.row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getLine() {
		return this.line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	public Integer getFloor() {
		return this.floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


}