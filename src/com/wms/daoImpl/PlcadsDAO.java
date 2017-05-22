package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IPlcadsDAO;
import com.wms.entity.Plcads;

/**
 * A data access object (DAO) providing persistence and search support for
 * Plcads entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Plcads
 * @author MyEclipse Persistence Tools
 */
public class PlcadsDAO extends HibernateDaoSupport implements IPlcadsDAO{

	@Override
	public void AddPlcads(Plcads model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeletePlcads(Plcads model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdatePlcads(Plcads model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Plcads GetPlcadsById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plcads> GetAllPlcads() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plcads> GetPlcadsBy(String plcname, String value) {
		// TODO Auto-generated method stub
		return null;
	}
	
}