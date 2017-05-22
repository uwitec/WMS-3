package com.wms.action;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.service.IFactoryService;

public class FactoryAction {

	IFactoryService service;

	public IFactoryService getService() {
		return service;
	}

	public void setService(IFactoryService service) {
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
