package com.wms.action;

import com.wms.service.IWoodPalletService;

/**
 * 木托盘信息表
 * 
 * @author Administrator
 * 
 */
public class WoodPalletAction {

	IWoodPalletService service;

	public IWoodPalletService getService() {
		return service;
	}

	public void setService(IWoodPalletService service) {
		this.service = service;
	}

	public String queryWoodPallet() {
		return "queryWoodPallet";
	}

	public String addWoodPallet() {

		return "addWoodPallet";
	}

	public String deleteWoodPallet() {
		return "deleteWoodPallet";
	}
}
