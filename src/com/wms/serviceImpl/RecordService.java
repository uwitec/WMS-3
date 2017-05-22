package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.IRecordDAO;
import com.wms.entity.Record;
import com.wms.entity.Task;
import com.wms.entity.User;
import com.wms.service.IRecordService;

@Service("RecordService")
public class RecordService implements IRecordService {
	private IRecordDAO dao;

	public void setDao(IRecordDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddRecord(Record model) {
		dao.AddRecord(model);
	}

	@Override
	public void DeleteRecord(Record model) {
		dao.DeleteRecord(model);
	}

	@Override
	public void UpdateRecord(Record model) {
		dao.UpdateRecord(model);
	}

	@Override
	public Record GetRecordByTaskId(int taskId) {
		return dao.GetRecordByTaskId(taskId);
	}

	@Override
	public List<Record> GetAllRecord() {
		return dao.GetAllRecord();
	}

	@Override
	public List<Record> GetRecordBy(Task task, User user, String type,
			String exeDate, String inMaterNum, String outMaterNum) {
		return dao.GetRecordBy(task, user, type, exeDate, inMaterNum,
				outMaterNum);
	}

	@Override
	public Record GetRecordById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
