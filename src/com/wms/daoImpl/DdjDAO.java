package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IDdjDAO;
import com.wms.entity.Ddj;
import com.wms.entity.Task;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ddj entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Ddj
 * @author MyEclipse Persistence Tools
 */
public class DdjDAO extends HibernateDaoSupport implements IDdjDAO{

	@Override
	public void AddDdj(Ddj model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteDdj(Ddj model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDdj(Ddj model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ddj GetDdjById(int id) {
		// TODO Auto-generated method stub
		return (Ddj)this.getHibernateTemplate().get(Ddj.class,id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ddj> GetAllDdj() {
		// TODO Auto-generated method stub
		
		return this.getHibernateTemplate().find("from com.wms.entity.Ddj");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ddj> GetDdjBy(String plcname, String value) {
		String hql = "from Ddj  where plcname like '%'+?+'%' and value like '%'+?+'%'";// 模糊查询
		Object[] params = new Object[] { plcname ,value};
		return this.getHibernateTemplate().find(hql, params);
	}
	
}