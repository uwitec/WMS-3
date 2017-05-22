package com.wms.service;

import java.util.List;

import com.wms.entity.Plcads;
import com.wms.entity.Task;
import com.wms.entity.User;

public interface IPlcadsService {

	void AddPlcads(Plcads model);

	void DeletePlcads(Plcads Plcads);

	void UpdatePlcads(Plcads model);

	Plcads GetPlcadsById(String id);

	List<Plcads> GetAllPlcads();

	List<Plcads> GetPlcadsBy(String plcname, String value);
}
