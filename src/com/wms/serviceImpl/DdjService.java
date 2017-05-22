package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IDdjDAO;
import com.wms.entity.Ddj;
import com.wms.entity.Task;
import com.wms.entity.User;
import com.wms.service.IDdjService;

@Service("DdjService")
public class DdjService implements IDdjService {
	private IDdjDAO dao;

	public void setDao(IDdjDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddDdj(Ddj model) {
		dao.AddDdj(model);
	}

	@Override
	public void DeleteDdj(Ddj model) {
		dao.DeleteDdj(model);
	}

	@Override
	public void UpdateDdj(Ddj model) {
		dao.UpdateDdj(model);
	}

	@Override
	public Ddj GetDdjById(int id) {
		return dao.GetDdjById(id);
	}

	@Override
	public List<Ddj> GetAllDdj() {
		return dao.GetAllDdj();
	}

	@Override
	public List<Ddj> GetDdjBy(String plcname, String value) {
		return dao.GetDdjBy(plcname,value);
	}


}
