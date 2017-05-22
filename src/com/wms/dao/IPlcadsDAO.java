package com.wms.dao;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.entity.Plcads;

public interface IPlcadsDAO {
	void AddPlcads(Plcads model);

	void DeletePlcads(Plcads model);

	void UpdatePlcads(Plcads model);

	Plcads GetPlcadsById(String id);

	List<Plcads> GetAllPlcads();

	List<Plcads> GetPlcadsBy(String plcname, String value);
}
