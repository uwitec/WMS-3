package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.ILogTableDAO;
import com.wms.entity.LogTable;

/**
 * A data access object (DAO) providing persistence and search support for
 * LogTable entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.LogTable
 * @author MyEclipse Persistence Tools
 */
public class LogTableDAO extends HibernateDaoSupport implements ILogTableDAO{

	@Override
	public void AddLogTable(LogTable model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteLogTable(LogTable model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateLogTable(LogTable model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LogTable> GetAllLogTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LogTable> GetLogTableBy(String logTime, String type,
			String title, String info) {
		// TODO Auto-generated method stub
		return null;
	}
	
}