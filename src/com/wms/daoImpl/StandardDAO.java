package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IStandardDAO;
import com.wms.entity.Standard;

/**
 * A data access object (DAO) providing persistence and search support for
 * Standard entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Standard
 * @author MyEclipse Persistence Tools
 */
public class StandardDAO extends HibernateDaoSupport implements IStandardDAO{

	@Override
	public void AddStandard(Standard model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteStandard(Standard model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateStandard(Standard model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Standard> GetAllStandard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Standard> GetStandardBy(String standard, String name,
			String grade, double length, double width, double high,
			double amount, int weight, String surfaceTreatment, String boudary,
			String factory, String remark) {
		// TODO Auto-generated method stub
		return null;
	}
	
}