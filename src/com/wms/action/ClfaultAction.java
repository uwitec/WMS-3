package com.wms.action;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.service.IClfaultService;

public class ClfaultAction {
	IClfaultService service;

	public IClfaultService getService() {
		return service;
	}

	public void setService(IClfaultService service) {
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
	// 读取输送线状态返回值到workstatus.jsp
}
