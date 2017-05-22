package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.ITaskDAO;
import com.wms.entity.Task;

/**
 * A data access object (DAO) providing persistence and search support for Task
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wms.entity.Task
 * @author MyEclipse Persistence Tools
 */
public class TaskDAO extends HibernateDaoSupport implements ITaskDAO{

	@Override
	public void AddTask(Task model) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(model);
	}

	@Override
	public void DeleteTask(Task model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateTask(Task model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Task GetTaskById(int id) {
		// TODO Auto-generated method stub
		return (Task)this.getHibernateTemplate().get(Task.class,id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> GetAllTask() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Task");
	}

	@Override
	public List<Task> GetTaskBy(String taskId, String type, String state,
			String PRI, String recTime, String inPosition, String inLine,
			String outPositon, String outLine, String materStandard,
			String Amount, String productStandard,String productAmount) {
		// TODO Auto-generated method stub
		return null;
	}
	
}