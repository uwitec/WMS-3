package com.wms.service;

import java.util.List;

import com.wms.entity.Ddj;
import com.wms.entity.Task;
import com.wms.entity.User;

public interface IDdjService {

	void AddDdj(Ddj model);

	void DeleteDdj(Ddj model);

	void UpdateDdj(Ddj model);

	Ddj GetDdjById(int id);

	List<Ddj> GetAllDdj();

	List<Ddj> GetDdjBy(String plcname, String value);
}
