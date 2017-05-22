package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IStandardDAO;
import com.wms.entity.Standard;
import com.wms.service.IStandardService;

@Service("StandardService")
public class StandardService implements IStandardService {
	private IStandardDAO dao;

	public void setDao(IStandardDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddStandard(Standard model) {
		dao.AddStandard(model);
	}

	@Override
	public void DeleteStandard(Standard model) {
		dao.DeleteStandard(model);
	}

	@Override
	public void UpdateStandard(Standard model) {
		dao.UpdateStandard(model);
	}

	@Override
	public List<Standard> GetAllStandard() {
		return dao.GetAllStandard();
	}

	@Override
	public List<Standard> GetStandardBy(String standard, String name,
			String grade, double length, double width, double high,
			double amount, int weight, String surfaceTreatment, String boudary,
			String factory, String remark) {
		return dao.GetStandardBy(standard, name, grade, length, width, high,
				amount, weight, surfaceTreatment, boudary, factory, remark);
	}
}
