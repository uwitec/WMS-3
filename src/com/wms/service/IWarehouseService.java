package com.wms.service;

import java.util.List;
import java.util.Set;

import com.wms.entity.Warehouse;

public interface IWarehouseService {

	void AddWarehouse(Warehouse model);

	void DeleteWarehouse(Warehouse model);

	void UpdateWarehouse(Warehouse model);

	Warehouse GetWarehouseByhouseId(int houseId);

	List<Warehouse> GetAllWarehouse();

	List<Warehouse> GetWarehouseBy(int houseId, int state, int row, int line,
			int floor, String remark, Set<?> woodPallets);
}
