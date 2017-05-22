package com.wms.dao;

import java.util.List;


import com.wms.entity.Ddj;

public interface IDdjDAO {
	void AddDdj(Ddj model);

	void DeleteDdj(Ddj model);

	void UpdateDdj(Ddj model);

	Ddj GetDdjById(int id);

	List<Ddj> GetAllDdj();

	List<Ddj> GetDdjBy(String plcname, String value);
}
