package com.wms.daoImpl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IRecordDAO;
import com.wms.entity.Record;
import com.wms.entity.Task;
import com.wms.entity.User;

/**
 * A data access object (DAO) providing persistence and search support for
 * Record entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wms.entity.Record
 * @author MyEclipse Persistence Tools
 */
public class RecordDAO extends HibernateDaoSupport implements IRecordDAO{

	@Override
	public void AddRecord(Record model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteRecord(Record model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateRecord(Record model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Record GetRecordById(int i) {
		// TODO Auto-generated method stub
		return null;
	}	
	
	@Override
	public Record GetRecordByTaskId(int taskId) {
		// TODO Auto-generated method stub
		String hql="from Record as r where r.TaskID=?";
		Object[] params=new Object[]{taskId};
		return (Record)this.getHibernateTemplate().find(hql,params);
	}

	@Override
	public List<Record> GetAllRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Record> GetRecordBy(Task task, User user, String type,
			String exeDate, String inMaterNum, String outMaterNum) {
		// TODO Auto-generated method stub
		return null;
	}
	
}