package com.wms.dao;

import java.util.List;

import com.wms.entity.Record;
import com.wms.entity.Task;
import com.wms.entity.User;

public interface IRecordDAO {
	void AddRecord(Record model);

	void DeleteRecord(Record model);

	void UpdateRecord(Record model);

	Record GetRecordByTaskId(int taskId);

	List<Record> GetAllRecord();

	List<Record> GetRecordBy(Task task, User user, String type, String exeDate,
			String inMaterNum, String outMaterNum);

	Record GetRecordById(int i);
}
