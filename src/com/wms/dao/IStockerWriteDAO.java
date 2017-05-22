package com.wms.dao;

import java.util.List;

import com.wms.entity.StockerWrite;

public interface IStockerWriteDAO {

	void AddStockerWrite(StockerWrite model);

	void DeleteStockerWrite(StockerWrite model);

	void UpdateStockerWrite(StockerWrite model);

	StockerWrite GetStockerWriteById(int id);

	List<StockerWrite> GetAllStockerWrite();
}
