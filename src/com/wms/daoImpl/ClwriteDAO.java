package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IClwriteDAO;
import com.wms.entity.Clwrite;

/**
 * A data access object (DAO) providing persistence and search support for
 * Clwrite entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Clwrite
 * @author MyEclipse Persistence Tools
 */
public class ClwriteDAO extends HibernateDaoSupport implements IClwriteDAO{

	@Override
	public void AddClwrite(Clwrite model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteClwrite(Clwrite model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateClwrite(Clwrite model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clwrite GetClwriteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clwrite> GetAllClwrite() {
		// TODO Auto-generated method stub
		return null;
	}
	
}