package com.wms.dao;

import java.util.List;

import com.wms.entity.Clwrite;

public interface IClwriteDAO {

	void AddClwrite(Clwrite model);

	void DeleteClwrite(Clwrite model);

	void UpdateClwrite(Clwrite model);

	Clwrite GetClwriteById(int id);

	List<Clwrite> GetAllClwrite();
}
