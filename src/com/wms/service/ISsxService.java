package com.wms.service;

import java.util.List;

import com.wms.entity.Ssx;
import com.wms.entity.Task;
import com.wms.entity.User;

public interface ISsxService {

	void AddSsx(Ssx model);

	void DeleteSsx(Ssx model);

	void UpdateSsx(Ssx model);

	Ssx GetSsxById(int id);

	List<Ssx> GetAllSsx();

	List<Ssx> GetSsxBy(String plcname, String value);
}
