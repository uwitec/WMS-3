package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IClfaultDAO;
import com.wms.entity.Clfault;

/**
 * A data access object (DAO) providing persistence and search support for
 * Clfault entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Clfault
 * @author MyEclipse Persistence Tools
 */
public class ClfaultDAO extends HibernateDaoSupport implements IClfaultDAO{

	@Override
	public void AddClfault(Clfault model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteClfault(Clfault model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateClfault(Clfault model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clfault GetClfaultByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clfault> GetAllClfault() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Clfault> GetClfaultBy(String code, String meaning) {
		String hql = "from Clfault as a where a.code like '%'+?+'%' and a.meaning like '%'+?+'%'";// 模糊查询
		Object[] params = new Object[] { code, meaning };
		return this.getHibernateTemplate().find(hql, params);
	}
	
}