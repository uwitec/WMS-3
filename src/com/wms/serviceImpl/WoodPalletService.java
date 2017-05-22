package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IWoodPalletDAO;
import com.wms.entity.Material;
import com.wms.entity.Warehouse;
import com.wms.entity.WoodPallet;
import com.wms.service.IWoodPalletService;

@Service("WoodPalletService")
public class WoodPalletService implements IWoodPalletService {
	private IWoodPalletDAO dao;

	public void setDao(IWoodPalletDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddWoodPallet(WoodPallet model) {
		dao.AddWoodPallet(model);
	}

	@Override
	public void DeleteWoodPallet(WoodPallet model) {
		dao.DeleteWoodPallet(model);
	}

	@Override
	public void UpdateWoodPallet(WoodPallet model) {
		dao.DeleteWoodPallet(model);
	}

	@Override
	public WoodPallet GetWoodPalletById(String id) {
		return dao.GetWoodPalletById(id);
	}

	@Override
	public List<WoodPallet> GetAllWoodPallet() {
		return dao.GetAllWoodPallet();
	}

	@Override
	public List<WoodPallet> GetWoodPalletBy(String id, Material material,
			Warehouse warehouse, double length, double width, String state) {
		return dao.GetWoodPalletBy(id, material, warehouse, length, width,
				state);
	}

	@Override
	public WoodPallet GetWoodPalletByHouseId(String houseid) {
		// TODO Auto-generated method stub
		return dao.GetWoodPalletByByHouseId(houseid);
	}

}
