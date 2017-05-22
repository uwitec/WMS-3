package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.ILogTableDAO;
import com.wms.entity.LogTable;
import com.wms.service.ILogTableService;

@Service("LogTableService")
public class LogTableService implements ILogTableService {
	private ILogTableDAO dao;

	public void setDao(ILogTableDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddLogTable(LogTable model) {
		dao.AddLogTable(model);
	}

	@Override
	public void DeleteLogTable(LogTable model) {
		dao.DeleteLogTable(model);
	}

	@Override
	public void UpdateLogTable(LogTable model) {
		dao.UpdateLogTable(model);
	}

	@Override
	public List<LogTable> GetAllLogTable() {
		return dao.GetAllLogTable();
	}

	@Override
	public List<LogTable> GetLogTableBy(String logTime, String type,
			String title, String info) {
		return dao.GetLogTableBy(logTime, type, title, info);
	}
}
