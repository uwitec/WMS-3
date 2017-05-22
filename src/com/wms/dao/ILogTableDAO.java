package com.wms.dao;

import java.util.List;

import com.wms.entity.LogTable;

public interface ILogTableDAO {
	void AddLogTable(LogTable model);

	void DeleteLogTable(LogTable model);

	void UpdateLogTable(LogTable model);

	List<LogTable> GetAllLogTable();

	List<LogTable> GetLogTableBy(String logTime, String type, String title,
			String info);
}
