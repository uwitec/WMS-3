package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IStockerFaultDAO;
import com.wms.entity.StockerFault;
import com.wms.service.IStockerFaultService;

@Service("StockerFaultService")
public class StockerFaultService implements IStockerFaultService {
	private IStockerFaultDAO dao;

	public void setDao(IStockerFaultDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddStockerFault(StockerFault model) {
		dao.AddStockerFault(model);
	}

	@Override
	public void DeleteStockerFault(StockerFault model) {
		dao.DeleteStockerFault(model);
	}

	@Override
	public void UpdateStockerFault(StockerFault model) {
		dao.UpdateStockerFault(model);
	}

	@Override
	public StockerFault GetStockerFaultByCode(StockerFault code) {
		return dao.GetStockerFaultByCode(code);
	}

	@Override
	public List<StockerFault> GetAllStockerFault() {
		return dao.GetAllStockerFault();
	}

	@Override
	public List<StockerFault> GetStockerFaultBy(String meaning, String remark) {
		return dao.GetStockerFaultBy(meaning, remark);
	}

}
