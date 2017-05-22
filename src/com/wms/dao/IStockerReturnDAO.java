package com.wms.dao;

import java.util.List;

import com.wms.entity.StockerReturn;

public interface IStockerReturnDAO {

	void AddStockerReturn(StockerReturn model);

	void DeleteStockerReturn(StockerReturn model);

	void UpdateStockerReturn(StockerReturn model);

	StockerReturn GetStockerReturnById(int id);

	List<StockerReturn> GetAllStockerReturn();

	List<StockerReturn> GetStockerReturnBy(String plcname, String value);
}
