package com.wms.action;

import com.wms.service.ILogTableService;

/**
 * 日志表
 * 
 * @author Administrator
 * 
 */
public class LogTableAction {
	ILogTableService service;

	public ILogTableService getService() {
		return service;
	}

	public void setService(ILogTableService service) {
		this.service = service;
	}

	public String queryLog() {
		return "queryLog";
	}

	public String queryWarmming() {
		return "queryWarmming";
	}

	public String reSet() {
		return "reSet";
	}

	public String nextAction() {
		return "nextAction";
	}

	public String deleteWarm() {
		return "deleteWarms";
	}

	public String upDateLocation() {
		return "upDateLocation";
	}
}
