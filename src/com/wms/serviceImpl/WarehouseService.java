package com.wms.serviceImpl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.wms.dao.IWarehouseDAO;
import com.wms.entity.Warehouse;
import com.wms.service.IWarehouseService;

@Service("WarehouseService")
public class WarehouseService implements IWarehouseService {
	private IWarehouseDAO dao;

	public void setDao(IWarehouseDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddWarehouse(Warehouse model) {
		dao.AddWarehouse(model);
	}

	@Override
	public void DeleteWarehouse(Warehouse model) {
		dao.DeleteWarehouse(model);
	}

	@Override
	public void UpdateWarehouse(Warehouse model) {
		dao.UpdateWarehouse(model);
	}

	@Override
	public Warehouse GetWarehouseByhouseId(int houseId) {
		return dao.GetWarehouseByhouseId(houseId);
	}

	@Override
	public List<Warehouse> GetAllWarehouse() {
		return dao.GetAllWarehouse();
	}

	@Override
	public List<Warehouse> GetWarehouseBy(int houseId, int state, int row,
			int line, int floor, String remark, Set<?> woodPallets) {
		return dao.GetWarehouseBy(houseId, state, row, line, floor, remark,
				woodPallets);
	}

}
