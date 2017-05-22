package com.wms.service;

import java.util.List;

import com.wms.entity.Material;
import com.wms.entity.Warehouse;
import com.wms.entity.WoodPallet;

public interface IWoodPalletService {

	void AddWoodPallet(WoodPallet model);

	void DeleteWoodPallet(WoodPallet model);

	void UpdateWoodPallet(WoodPallet model);

	WoodPallet GetWoodPalletById(String id);

	List<WoodPallet> GetAllWoodPallet();

	List<WoodPallet> GetWoodPalletBy(String id, Material material,
			Warehouse warehouse, double length, double width, String state);

	WoodPallet GetWoodPalletByHouseId(String string);
}
