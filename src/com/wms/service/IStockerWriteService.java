package com.wms.service;

import java.util.List;

import com.wms.entity.StockerWrite;

public interface IStockerWriteService {

	void AddStockerWrite(StockerWrite model);

	void DeleteStockerWrite(StockerWrite model);

	void UpdateStockerWrite(StockerWrite model);

	StockerWrite GetStockerWriteById(int id);

	List<StockerWrite> GetAllStockerWrite();
}
