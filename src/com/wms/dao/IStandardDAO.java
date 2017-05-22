package com.wms.dao;

import java.util.List;

import com.wms.entity.Standard;

public interface IStandardDAO {
	void AddStandard(Standard model);

	void DeleteStandard(Standard model);

	void UpdateStandard(Standard model);

	List<Standard> GetAllStandard();

	List<Standard> GetStandardBy(String standard, String name, String grade,
			double length, double width, double high, double amount,
			int weight, String surfaceTreatment, String boudary,
			String factory, String remark);
}
