package com.wms.action;

import com.wms.service.IWarehouseService;

/**
 * 库位信息表
 * 
 * @author Administrator
 * 
 */
public class WarehouseAction {

	IWarehouseService service;

	public IWarehouseService getService() {
		return service;
	}

	public void setService(IWarehouseService service) {
		this.service = service;
	}

	public String locationMaintenance() {

		return "locationMaintenance";
	}

	public String loctionQuery() {

		return "loctionQuery";
	}

	public String stockManager() {
		return "stockManager";
	}

	public String newWork() {

		return "newWork";
	}

}
