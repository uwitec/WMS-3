package com.wms.service;

import java.util.List;

import com.wms.entity.Task;

public interface ITaskService {

	void AddTask(Task model);

	void DeleteTask(Task model);

	void UpdateTask(Task model);

	Task GetTaskById(int id);

	List<Task> GetAllTask();

	List<Task> GetTaskBy(String taskId, String type, String state, String PRI,
			String recTime, String inPosition, String inLine,
			String outPositon, String outLine, String materStandard,
			String Amount, String productStandard,String productAmount);
}
