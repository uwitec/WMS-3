package com.wms.daoImpl;

import java.util.List;
import java.util.Set;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IWarehouseDAO;
import com.wms.entity.Warehouse;

/**
 * A data access object (DAO) providing persistence and search support for
 * Warehouse entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Warehouse
 * @author MyEclipse Persistence Tools
 */
public class WarehouseDAO extends HibernateDaoSupport implements IWarehouseDAO{

	@Override
	public void AddWarehouse(Warehouse model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteWarehouse(Warehouse model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateWarehouse(Warehouse model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Warehouse GetWarehouseByhouseId(int houseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Warehouse> GetAllWarehouse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Warehouse> GetWarehouseBy(int houseId, int state, int row,
			int line, int floor, String remark, Set<?> woodPallets) {
		// TODO Auto-generated method stub
		return null;
	}
	
}