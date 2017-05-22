package com.wms.entity;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record implements java.io.Serializable {

	// Fields

	private Integer id;
	private Task task;
	private String type;
	private String exeDate;
	private String inMaterNum;
	private String outMaterNum;
	private String userId;
	private Integer taskId;

	// Constructors

	/** default constructor */
	public Record() {
	}

	/** minimal constructor */
	public Record(Task task) {
		this.task = task;
	}

	/** full constructor */
	public Record(Task task, String type, String exeDate, String inMaterNum,
			String outMaterNum, String userId, Integer taskId) {
		this.task = task;
		this.type = type;
		this.exeDate = exeDate;
		this.inMaterNum = inMaterNum;
		this.outMaterNum = outMaterNum;
		this.userId = userId;
		this.taskId = taskId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExeDate() {
		return this.exeDate;
	}

	public void setExeDate(String exeDate) {
		this.exeDate = exeDate;
	}

	public String getInMaterNum() {
		return this.inMaterNum;
	}

	public void setInMaterNum(String inMaterNum) {
		this.inMaterNum = inMaterNum;
	}

	public String getOutMaterNum() {
		return this.outMaterNum;
	}

	public void setOutMaterNum(String outMaterNum) {
		this.outMaterNum = outMaterNum;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

}