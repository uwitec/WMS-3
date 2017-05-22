package com.wms.action;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.service.IStockerReturnService;

public class StockerReturnAction {

	IStockerReturnService service;

	public IStockerReturnService getService() {
		return service;
	}

	public void setService(IStockerReturnService service) {
		this.service = service;
	}

	void AddClfault(Clfault model) {
	};

	void DeleteClfault(Clfault model) {
	};

	void UpdateClfault(Clfault model) {
	};

	Clfault GetClfaultById(int id) {
		return null;
	};

	List<Clfault> GetAllClfault() {
		return null;
	};

	List<Clfault> GetClfaultBy(int id, String name) {
		return null;
	};
	// 读取堆垛机状态，返回值到workstatus.jsp
}
