package com.wms.entity;

/**
 * LogTable entity. @author MyEclipse Persistence Tools
 */

public class LogTable implements java.io.Serializable {

	// Fields

	private Integer id;
	private String logTime;
	private String type;
	private String title;
	private String info;

	// Constructors

	/** default constructor */
	public LogTable() {
	}

	/** full constructor */
	public LogTable(String logTime, String type, String title, String info) {
		this.logTime = logTime;
		this.type = type;
		this.title = title;
		this.info = info;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogTime() {
		return this.logTime;
	}

	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}