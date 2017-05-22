package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IClpositionDAO;
import com.wms.entity.Clfault;
import com.wms.entity.Clposition;

/**
 * A data access object (DAO) providing persistence and search support for
 * Clposition entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Clposition
 * @author MyEclipse Persistence Tools
 */
public class ClpositionDAO extends HibernateDaoSupport implements IClpositionDAO{

	@Override
	public void AddClposition(Clposition model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteClposition(Clposition model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateClposition(Clposition model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clposition GetClpositionById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clposition> GetAllClposition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clfault> GetClfaultBy(String meaning) {
		// TODO Auto-generated method stub
		return null;
	}
	
}