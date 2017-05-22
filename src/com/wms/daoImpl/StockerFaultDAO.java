package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IStockerFaultDAO;
import com.wms.entity.StockerFault;

/**
 * A data access object (DAO) providing persistence and search support for
 * StockerFault entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wms.entity.StockerFault
 * @author MyEclipse Persistence Tools
 */
public class StockerFaultDAO extends HibernateDaoSupport implements IStockerFaultDAO{

	@Override
	public void AddStockerFault(StockerFault model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteStockerFault(StockerFault model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateStockerFault(StockerFault model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StockerFault GetStockerFaultByCode(StockerFault code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockerFault> GetAllStockerFault() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StockerFault> GetStockerFaultBy(String code, String meaning) {
		String hql = "from StockerFault as a where a.code like '%'+?+'%' and a.meaning like '%'+?+'%'";// 模糊查询
		Object[] params = new Object[] { code, meaning };
		return this.getHibernateTemplate().find(hql, params);
	}
	
}