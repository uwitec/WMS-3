package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.daoImpl.ClpositionDAO;
import com.wms.entity.Clfault;
import com.wms.entity.Clposition;
import com.wms.service.IClpositionService;

@Service("ClpositionService")
public class ClpositionService implements IClpositionService {

	private ClpositionDAO dao;

	public void setDao(ClpositionDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddClposition(Clposition model) {
		dao.AddClposition(model);

	}

	@Override
	public void DeleteClposition(Clposition model) {
		dao.DeleteClposition(model);

	}

	@Override
	public void UpdateClposition(Clposition model) {
		dao.UpdateClposition(model);

	}

	@Override
	public Clposition GetClpositionById(int id) {
		return dao.GetClpositionById(id);
	}

	@Override
	public List<Clposition> GetAllClposition() {
		return dao.GetAllClposition();
	}

	@Override
	public List<Clfault> GetClfaultBy(String meaning) {
		return dao.GetClfaultBy(meaning);
	}

}
