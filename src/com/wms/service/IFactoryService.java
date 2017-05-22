package com.wms.service;

import java.util.List;

import com.wms.entity.Factory;

public interface IFactoryService {

	void AddFactory(Factory model);

	void DeleteFactory(Factory model);

	void UpdateFactory(Factory model);

	Factory GetFactoryById(String id);

	List<Factory> GetAllFactory();

	List<Factory> GetFactoryBy(String factory, String address, String tel,
			String linkName);
}
