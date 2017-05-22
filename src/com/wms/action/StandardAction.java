package com.wms.action;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.service.IStandardService;

/**
 * 规格表
 * 
 * @author Administrator
 * 
 */
public class StandardAction {

	IStandardService service;

	public IStandardService getService() {
		return service;
	}

	public void setService(IStandardService service) {
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
