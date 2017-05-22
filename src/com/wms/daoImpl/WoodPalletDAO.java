package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IWoodPalletDAO;
import com.wms.entity.Material;
import com.wms.entity.Warehouse;
import com.wms.entity.WoodPallet;

/**
 * A data access object (DAO) providing persistence and search support for
 * WoodPallet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.WoodPallet
 * @author MyEclipse Persistence Tools
 */
public class WoodPalletDAO extends HibernateDaoSupport implements IWoodPalletDAO{

	@Override
	public void AddWoodPallet(WoodPallet model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteWoodPallet(WoodPallet model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateWoodPallet(WoodPallet model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WoodPallet GetWoodPalletById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WoodPallet> GetAllWoodPallet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WoodPallet> GetWoodPalletBy(String id, Material material,
			Warehouse warehouse, double length, double width, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public WoodPallet GetWoodPalletByByHouseId(String houseid) {
		// TODO Auto-generated method stub
		String hql="from WoodPallet as w where w.HouseID=?";
		Object[] params=new Object[]{houseid};
		return ((List<WoodPallet>)this.getHibernateTemplate().find(hql,params)).get(0);
	}
	
}