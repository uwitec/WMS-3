package com.wms.service;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.wms.entity.StockerReturn;

public interface IStockerReturnService {

	void AddStockerReturn(StockerReturn model);

	void DeleteStockerReturn(StockerReturn model);

	void UpdateStockerReturn(StockerReturn model);

	StockerReturn GetStockerReturnById(int id);

	List<StockerReturn> GetAllStockerReturn();

	List<StockerReturn> GetStockerReturnBy(String plcname, String value);
}
