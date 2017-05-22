package com.wms.dao;

import java.util.List;


import com.wms.entity.Ssx;

public interface ISsxDAO {
	void AddSsx(Ssx model);

	void DeleteSsx(Ssx model);

	void UpdateSsx(Ssx model);

	Ssx GetSsxById(int id);

	List<Ssx> GetAllSsx();

	List<Ssx> GetSsxBy(String plcname, String value);
}
