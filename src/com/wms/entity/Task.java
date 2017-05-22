package com.wms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Task entity. @author MyEclipse Persistence Tools
 */

public class Task implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private String state;
	private String pri;
	private String recTime;
	private String inPosition;
	private String inLine;
	private String outPosition;
	private String outLine;
	private String materStandard;
	private String materAmount;
	private String productStandard;
	private String productAmount;

	// Constructors

	/** default constructor */
	public Task() {
	}

	/** full constructor */
	public Task(String type, String state, String pri, String recTime,
			String inPosition, String inLine, String outPosition,
			String outLine, String materStandard, String materAmount,
			String productStandard, String productAmount){
		this.type = type;
		this.state = state;
		this.pri = pri;
		this.recTime = recTime;
		this.inPosition = inPosition;
		this.inLine = inLine;
		this.outPosition = outPosition;
		this.outLine = outLine;
		this.materStandard = materStandard;
		this.materAmount = materAmount;
		this.productStandard = productStandard;
		this.productAmount = productAmount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPri() {
		return this.pri;
	}

	public void setPri(String pri) {
		this.pri = pri;
	}

	public String getRecTime() {
		return this.recTime;
	}

	public void setRecTime(String recTime) {
		this.recTime = recTime;
	}

	public String getInPosition() {
		return this.inPosition;
	}

	public void setInPosition(String inPosition) {
		this.inPosition = inPosition;
	}

	public String getInLine() {
		return this.inLine;
	}

	public void setInLine(String inLine) {
		this.inLine = inLine;
	}

	public String getOutPosition() {
		return this.outPosition;
	}

	public void setOutPosition(String outPosition) {
		this.outPosition = outPosition;
	}

	public String getOutLine() {
		return this.outLine;
	}

	public void setOutLine(String outLine) {
		this.outLine = outLine;
	}

	public String getMaterStandard() {
		return this.materStandard;
	}

	public void setMaterStandard(String materStandard) {
		this.materStandard = materStandard;
	}

	public String getMaterAmount() {
		return this.materAmount;
	}

	public void setMaterAmount(String materAmount) {
		this.materAmount = materAmount;
	}

	public String getProductStandard() {
		return this.productStandard;
	}

	public void setProductStandard(String productStandard) {
		this.productStandard = productStandard;
	}

	public String getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(String productAmount) {
		this.productAmount = productAmount;
	}


}