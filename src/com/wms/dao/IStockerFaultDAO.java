package com.wms.dao;

import java.util.List;

import com.wms.entity.StockerFault;

public interface IStockerFaultDAO {
	void AddStockerFault(StockerFault model);

	void DeleteStockerFault(StockerFault model);

	void UpdateStockerFault(StockerFault model);

	StockerFault GetStockerFaultByCode(StockerFault code);

	List<StockerFault> GetAllStockerFault();

	List<StockerFault> GetStockerFaultBy(String meaning, String remark);

}
