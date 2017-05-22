package com.wms.action;

import com.wms.service.IClwriteService;

public class ClwriteAction {

	IClwriteService service;

	public IClwriteService getService() {
		return service;
	}

	public void setService(IClwriteService service) {
		this.service = service;
	}

	public String stop() {
		return "stop";
	}

	public String outLine() {
		return "outLine";
	}
}
