package com.wms.dao;

import java.util.List;

import com.wms.entity.Clreturn;

public interface IClreturnDAO {

	void AddClreturn(Clreturn model);

	void DeleteClreturn(Clreturn model);

	void UpdateClreturn(Clreturn model);

	Clreturn GetClreturnById(int id);

	List<Clreturn> GetAllClreturn();
	
	List<Clreturn> GetClreturnBy(String plcname,String value);
}
