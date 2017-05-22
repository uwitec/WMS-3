package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.daoImpl.ClfaultDAO;
import com.wms.entity.Clfault;
import com.wms.service.IClfaultService;

@Service("ClfaultService")
public class ClfaultService implements IClfaultService {

	private ClfaultDAO dao;

	public void setDao(ClfaultDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddClfault(Clfault model) {
		dao.AddClfault(model);
	}

	@Override
	public void DeleteClfault(Clfault model) {
		dao.DeleteClfault(model);
	}

	@Override
	public void UpdateClfault(Clfault model) {
		dao.UpdateClfault(model);
	}

	@Override
	public Clfault GetClfaultByCode(String code) {
		return dao.GetClfaultByCode(code);
	}

	@Override
	public List<Clfault> GetAllClfault() {

		return dao.GetAllClfault();
	}

	@Override
	public List<Clfault> GetClfaultBy(String code, String meaning) {
		return dao.GetClfaultBy(code, meaning);
	}

}
