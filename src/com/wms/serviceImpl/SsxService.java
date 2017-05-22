package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.ISsxDAO;
import com.wms.entity.Ssx;
import com.wms.entity.Task;
import com.wms.entity.User;
import com.wms.service.ISsxService;

@Service("SsxService")
public class SsxService implements ISsxService {
	private ISsxDAO dao;

	public void setDao(ISsxDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddSsx(Ssx model) {
		dao.AddSsx(model);
	}

	@Override
	public void DeleteSsx(Ssx model) {
		dao.DeleteSsx(model);
	}

	@Override
	public void UpdateSsx(Ssx model) {
		dao.UpdateSsx(model);
	}

	@Override
	public Ssx GetSsxById(int id) {
		return dao.GetSsxById(id);
	}

	@Override
	public List<Ssx> GetAllSsx() {
		return dao.GetAllSsx();
	}

	@Override
	public List<Ssx> GetSsxBy(String plcname, String value) {
		return dao.GetSsxBy(plcname,value);
	}


}
