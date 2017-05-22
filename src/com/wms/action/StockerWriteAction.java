package com.wms.action;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.service.IStockerWriteService;

public class StockerWriteAction {

	IStockerWriteService service;

	public IStockerWriteService getService() {
		return service;
	}

	public void setService(IStockerWriteService service) {
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
}
