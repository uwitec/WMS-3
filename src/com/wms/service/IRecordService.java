package com.wms.service;

import java.util.List;

import com.wms.entity.Record;
import com.wms.entity.Task;
import com.wms.entity.User;

public interface IRecordService {

	void AddRecord(Record model);

	void DeleteRecord(Record model);

	void UpdateRecord(Record model);

	Record GetRecordById(int id);

	List<Record> GetAllRecord();

	List<Record> GetRecordBy(Task task, User user, String type, String exeDate,
			String inMaterNum, String outMaterNum);

	Record GetRecordByTaskId(int taskId);
}
