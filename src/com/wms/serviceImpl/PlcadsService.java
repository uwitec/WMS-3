package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IPlcadsDAO;
import com.wms.entity.Plcads;
import com.wms.entity.Task;
import com.wms.entity.User;
import com.wms.service.IPlcadsService;

@Service("PlcadsService")
public class PlcadsService implements IPlcadsService {
	private IPlcadsDAO dao;

	public void setDao(IPlcadsDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddPlcads(Plcads model) {
		dao.AddPlcads(model);
	}

	@Override
	public void DeletePlcads(Plcads model) {
		dao.DeletePlcads(model);
	}

	@Override
	public void UpdatePlcads(Plcads model) {
		dao.UpdatePlcads(model);
	}

	@Override
	public Plcads GetPlcadsById(String id) {
		return dao.GetPlcadsById(id);
	}

	@Override
	public List<Plcads> GetAllPlcads() {
		return dao.GetAllPlcads();
	}

	@Override
	public List<Plcads> GetPlcadsBy(String plcname, String value) {
		return dao.GetPlcadsBy(plcname,value);
	}


}
