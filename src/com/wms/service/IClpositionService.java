package com.wms.service;

import java.util.List;

import com.wms.entity.Clfault;
import com.wms.entity.Clposition;

public interface IClpositionService {

	void AddClposition(Clposition model);

	void DeleteClposition(Clposition model);

	void UpdateClposition(Clposition model);

	Clposition GetClpositionById(int id);

	List<Clposition> GetAllClposition();

	List<Clfault> GetClfaultBy(String meaning);

}
