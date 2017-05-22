package com.wms.action;

import com.wms.service.IRecordService;

/**
 * 任务记录表
 * 
 * @author Administrator
 * 
 */
public class RecordAction {
	IRecordService service;

	public IRecordService getService() {
		return service;
	}

	public void setService(IRecordService service) {
		this.service = service;
	}

	public String queryReport() {
		return "queryReport";
	}

	public String visualWork() {
		return "visualWork";
	}
}
