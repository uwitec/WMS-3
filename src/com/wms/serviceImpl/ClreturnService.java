package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.daoImpl.ClreturnDAO;
import com.wms.entity.Clreturn;
import com.wms.service.IClreturnService;

@Service("ClreturnService")
public class ClreturnService implements IClreturnService {

	private ClreturnDAO dao;

	public void setDao(ClreturnDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddClreturn(Clreturn model) {
		dao.AddClreturn(model);

	}

	@Override
	public void DeleteClreturn(Clreturn model) {
		dao.DeleteClreturn(model);

	}

	@Override
	public void UpdateClreturn(Clreturn model) {
		dao.UpdateClreturn(model);

	}

	@Override
	public Clreturn GetClreturnById(int id) {
		return dao.GetClreturnById(id);
	}

	@Override
	public List<Clreturn> GetAllClreturn() {
		return dao.GetAllClreturn();
	}
	
	@Override
	public List<Clreturn> GetClreturnBy(String plcname, String value) {
		return dao.GetClreturnBy(plcname, value);
	}
}
