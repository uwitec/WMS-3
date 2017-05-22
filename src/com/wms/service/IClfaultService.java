package com.wms.service;

import java.util.List;

import com.wms.entity.Clfault;

public interface IClfaultService {

	void AddClfault(Clfault model);

	void DeleteClfault(Clfault model);

	void UpdateClfault(Clfault model);

	Clfault GetClfaultByCode(String code);

	List<Clfault> GetAllClfault();

	List<Clfault> GetClfaultBy(String code, String meaning);
}
