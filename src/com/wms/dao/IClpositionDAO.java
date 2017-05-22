package com.wms.dao;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.entity.Clposition;

public interface IClpositionDAO {

	void AddClposition(Clposition model);

	void DeleteClposition(Clposition model);

	void UpdateClposition(Clposition model);

	Clposition GetClpositionById(int id);

	List<Clposition> GetAllClposition();

	List<Clfault> GetClfaultBy(String meaning);
}
