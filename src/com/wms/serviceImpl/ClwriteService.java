package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.daoImpl.ClwriteDAO;
import com.wms.entity.Clwrite;
import com.wms.service.IClwriteService;

@Service("ClwriteService")
public class ClwriteService implements IClwriteService {

	private ClwriteDAO dao;

	public void setDao(ClwriteDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddClwrite(Clwrite model) {
		dao.AddClwrite(model);

	}

	@Override
	public void DeleteClwrite(Clwrite model) {
		dao.DeleteClwrite(model);

	}

	@Override
	public void UpdateClwrite(Clwrite model) {
		dao.UpdateClwrite(model);

	}

	@Override
	public Clwrite GetClwriteById(int id) {
		return dao.GetClwriteById(id);
	}

	@Override
	public List<Clwrite> GetAllClwrite() {
		return dao.GetAllClwrite();
	}
}
