package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IFactoryDAO;
import com.wms.entity.Factory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Factory entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Factory
 * @author MyEclipse Persistence Tools
 */
public class FactoryDAO extends HibernateDaoSupport implements IFactoryDAO{

	@Override
	public void AddFactory(Factory model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteFactory(Factory model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateFactory(Factory model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Factory GetFactoryById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Factory> GetAllFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Factory> GetFactoryBy(String factory, String address,
			String tel, String linkName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}