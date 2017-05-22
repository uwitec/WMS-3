package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IMaterialDAO;
import com.wms.entity.Material;
import com.wms.service.IMaterialService;

@Service("MaterialService")
public class MaterialService implements IMaterialService {
	private IMaterialDAO dao;

	public void setDao(IMaterialDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddMaterial(Material model) {
		dao.AddMaterial(model);
	}

	@Override
	public void DeleteMaterial(Material model) {
		dao.DeleteMaterial(model);
	}

	@Override
	public void UpdateMaterial(Material model) {
		dao.UpdateMaterial(model);
	}

	@Override
	public List<Material> GetAllMaterial() {
		return dao.GetAllMaterial();
	}

	@Override
	public Material GetMaterialByMaterialNum(String materialNum) {
		return dao.GetMaterialByMaterialNum(materialNum);
	}

	@Override
	public List<Material> GetMaterialBy(String materNum, String name,
			String furnace, String roolNum, String bundleNum, double length,
			double width, double high, int amount, double weight, String mark,
			String factory, String standard, String surfaceTreatment,
			String boudary, String grade, String proDate, String packTeam,
			String checker, String rohs, String remark) {
		return dao.GetMaterialBy(materNum, name, furnace, roolNum, bundleNum,
				length, width, high, amount, weight, mark, factory, standard,
				surfaceTreatment, boudary, grade, proDate, packTeam, checker,
				rohs, remark);
	}
}
