package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IStockerReturnDAO;
import com.wms.entity.StockerReturn;

/**
 * A data access object (DAO) providing persistence and search support for
 * StockerReturn entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wms.entity.StockerReturn
 * @author MyEclipse Persistence Tools
 */
public class StockerReturnDAO extends HibernateDaoSupport implements IStockerReturnDAO{

	@Override
	public void AddStockerReturn(StockerReturn model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteStockerReturn(StockerReturn model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateStockerReturn(StockerReturn model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StockerReturn GetStockerReturnById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockerReturn> GetAllStockerReturn() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StockerReturn> GetStockerReturnBy(String plcname, String value) {
		String hql = "from StockerReturn where plcname like '%'+?+'%' and readValue like '%'+?+'%'";// 模糊查询
		Object[] params = new Object[] { plcname, value };
		return this.getHibernateTemplate().find(hql, params);
	}
	
}