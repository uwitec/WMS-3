package com.wms.service;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.wms.entity.Clreturn;

public interface IClreturnService {

	void AddClreturn(Clreturn model);

	void DeleteClreturn(Clreturn model);

	void UpdateClreturn(Clreturn model);

	Clreturn GetClreturnById(int id);

	List<Clreturn> GetAllClreturn();

	List<Clreturn> GetClreturnBy(String plcname, String value);
}
