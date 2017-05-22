package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IMaterialDAO;
import com.wms.entity.Material;

/**
 * A data access object (DAO) providing persistence and search support for
 * Material entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Material
 * @author MyEclipse Persistence Tools
 */
public class MaterialDAO extends HibernateDaoSupport implements IMaterialDAO{

	@Override
	public void AddMaterial(Material model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteMaterial(Material model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateMaterial(Material model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Material GetMaterialByMaterialNum(String materialNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Material> GetAllMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Material> GetMaterialBy(String materNum, String name,
			String furnace, String roolNum, String bundleNum, double length,
			double width, double high, int amount, double weight, String mark,
			String factory, String standard, String surfaceTreatment,
			String boudary, String grade, String proDate, String packTeam,
			String checker, String rohs, String remark) {
		// TODO Auto-generated method stub
		return null;
	}
	
}