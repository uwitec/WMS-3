package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IFactoryDAO;
import com.wms.entity.Factory;
import com.wms.service.IFactoryService;

@Service("FactoryService")
public class FactoryService implements IFactoryService {
	private IFactoryDAO dao;

	public void setDao(IFactoryDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddFactory(Factory model) {
		// TODO Auto-generated method stub
		dao.AddFactory(model);
	}

	@Override
	public void DeleteFactory(Factory model) {
		// TODO Auto-generated method stub
		dao.DeleteFactory(model);
	}

	@Override
	public void UpdateFactory(Factory model) {
		// TODO Auto-generated method stub
		dao.UpdateFactory(model);
	}

	@Override
	public Factory GetFactoryById(String id) {
		// TODO Auto-generated method stub
		return dao.GetFactoryById(id);
	}

	@Override
	public List<Factory> GetAllFactory() {
		// TODO Auto-generated method stub
		return dao.GetAllFactory();
	}

	@Override
	public List<Factory> GetFactoryBy(String factory, String address,
			String tel, String linkName) {
		return dao.GetFactoryBy(factory, address, tel, linkName);
	}
}
