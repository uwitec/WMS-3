package com.wms.service;

import java.util.List;

import com.wms.entity.Material;

public interface IMaterialService {

	void AddMaterial(Material model);

	void DeleteMaterial(Material model);

	void UpdateMaterial(Material model);

	Material GetMaterialByMaterialNum(String materialNum);

	List<Material> GetAllMaterial();

	List<Material> GetMaterialBy(String materNum, String name, String furnace,
			String roolNum, String bundleNum, double length, double width,
			double high, int amount, double weight, String mark,
			String factory, String standard, String surfaceTreatment,
			String boudary, String grade, String proDate, String packTeam,
			String checker, String rohs, String remark);
}
