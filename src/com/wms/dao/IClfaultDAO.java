package com.wms.dao;

import java.util.List;

import com.wms.entity.Clfault;

public interface IClfaultDAO {
	void AddClfault(Clfault model);

	void DeleteClfault(Clfault model);

	void UpdateClfault(Clfault model);

	Clfault GetClfaultByCode(String code);

	List<Clfault> GetAllClfault();

	List<Clfault> GetClfaultBy(String code, String meaning);
}
