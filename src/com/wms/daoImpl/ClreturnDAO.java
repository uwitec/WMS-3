package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IClreturnDAO;
import com.wms.entity.Clreturn;

/**
 * A data access object (DAO) providing persistence and search support for
 * Clreturn entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Clreturn
 * @author MyEclipse Persistence Tools
 */
public class ClreturnDAO extends HibernateDaoSupport implements IClreturnDAO{

	@Override
	public void AddClreturn(Clreturn model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteClreturn(Clreturn model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateClreturn(Clreturn model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clreturn GetClreturnById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clreturn> GetAllClreturn() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Clreturn> GetClreturnBy(String plcname,String value){
		String hql = "from Clreturn  where plcname like '%'+?+'%' and readValue like '%'+?+'%'";// 模糊查询
		Object[] params = new Object[] { plcname ,value};
		return this.getHibernateTemplate().find(hql, params);
	}
	
}