package com.wms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wms.dao.ITaskDAO;
import com.wms.entity.Task;
import com.wms.service.ITaskService;

@Service("TaskService")
public class TaskService implements ITaskService {
	private ITaskDAO dao;

	public void setDao(ITaskDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddTask(Task model) {
		dao.AddTask(model);
	}

	@Override
	public void DeleteTask(Task model) {
		dao.DeleteTask(model);
	}

	@Override
	public void UpdateTask(Task model) {
		dao.UpdateTask(model);
	}

	@Override
	public Task GetTaskById(int id) {
		return dao.GetTaskById(id);
	}

	@Override
	public List<Task> GetAllTask() {
		return dao.GetAllTask();
	}

	@Override
	public List<Task> GetTaskBy(String taskId, String type, String state,
			String PRI, String recTime, String inPosition, String inLine,
			String outPositon, String outLine, String materStandard,
			String Amount, String productStandard,String productAmount) {
		// TODO Auto-generated method stub
		return dao.GetTaskBy(taskId, type, state, PRI, recTime, inPosition,
				inLine, outPositon, outLine, materStandard, Amount,
				productStandard,productAmount);
	}

}
