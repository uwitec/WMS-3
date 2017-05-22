package com.wms.dao;

import java.util.List;

import com.wms.entity.Task;

public interface ITaskDAO {
	void AddTask(Task model);

	void DeleteTask(Task model);

	void UpdateTask(Task model);

	Task GetTaskById(int id);

	List<Task> GetAllTask();

	List<Task> GetTaskBy(String taskId, String type, String state, String PRI,
			String recTime, String inPosition, String inLine,
			String outPositon, String outLine, String materStandard,
			String materAmount, String productStandard,String productAmount);
}
