package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IStockerReturnDAO;
import com.wms.entity.StockerReturn;
import com.wms.service.IStockerReturnService;

@Service("StockerReturnService")
public class StockerReturnService implements IStockerReturnService {
	private IStockerReturnDAO dao;

	public void setDao(IStockerReturnDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddStockerReturn(StockerReturn model) {
		dao.AddStockerReturn(model);
	}

	@Override
	public void DeleteStockerReturn(StockerReturn model) {
		dao.DeleteStockerReturn(model);
	}

	@Override
	public void UpdateStockerReturn(StockerReturn model) {
		dao.UpdateStockerReturn(model);
	}

	@Override
	public StockerReturn GetStockerReturnById(int id) {
		return dao.GetStockerReturnById(id);
	}

	@Override
	public List<StockerReturn> GetAllStockerReturn() {
		return dao.GetAllStockerReturn();
	}

	@Override
	public List<StockerReturn> GetStockerReturnBy(String plcname, String value) {
		return dao.GetStockerReturnBy(plcname,value);
	}

}
