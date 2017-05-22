package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.ISsxDAO;
import com.wms.entity.Ssx;
import com.wms.entity.Task;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ssx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Ssx
 * @author MyEclipse Persistence Tools
 */
public class SsxDAO extends HibernateDaoSupport implements ISsxDAO{

	@Override
	public void AddSsx(Ssx model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteSsx(Ssx model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateSsx(Ssx model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ssx GetSsxById(int id) {
		// TODO Auto-generated method stub
		return (Ssx)this.getHibernateTemplate().get(Ssx.class,id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ssx> GetAllSsx() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from com.wms.entity.Ssx");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ssx> GetSsxBy(String plcname, String value) {
		String hql = "from Ssx  where plcname like '%'+?+'%' and value like '%'+?+'%'";// 模糊查询
		Object[] params = new Object[] { plcname ,value};
		return this.getHibernateTemplate().find(hql, params);
	}
	
}