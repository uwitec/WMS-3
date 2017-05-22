package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IStockerWriteDAO;
import com.wms.entity.StockerWrite;
import com.wms.service.IStockerWriteService;

@Service("StockerWriteService")
public class StockerWriteService implements IStockerWriteService {
	private IStockerWriteDAO dao;

	public void setDao(IStockerWriteDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddStockerWrite(StockerWrite model) {
		dao.AddStockerWrite(model);
	}

	@Override
	public void DeleteStockerWrite(StockerWrite model) {
		dao.DeleteStockerWrite(model);
	}

	@Override
	public void UpdateStockerWrite(StockerWrite model) {
		dao.UpdateStockerWrite(model);
	}

	@Override
	public StockerWrite GetStockerWriteById(int id) {
		return dao.GetStockerWriteById(id);
	}

	@Override
	public List<StockerWrite> GetAllStockerWrite() {
		return dao.GetAllStockerWrite();
	}

}
