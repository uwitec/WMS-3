package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IStockerWriteDAO;
import com.wms.entity.StockerWrite;

/**
 * A data access object (DAO) providing persistence and search support for
 * StockerWrite entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wms.entity.StockerWrite
 * @author MyEclipse Persistence Tools
 */
public class StockerWriteDAO extends HibernateDaoSupport implements IStockerWriteDAO{

	@Override
	public void AddStockerWrite(StockerWrite model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteStockerWrite(StockerWrite model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateStockerWrite(StockerWrite model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StockerWrite GetStockerWriteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockerWrite> GetAllStockerWrite() {
		// TODO Auto-generated method stub
		return null;
	}
	
}