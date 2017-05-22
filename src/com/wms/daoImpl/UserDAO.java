package com.wms.daoImpl;

import java.util.List;
import java.util.Set;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wms.dao.IUserDAO;
import com.wms.entity.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wms.entity.User
 * @author MyEclipse Persistence Tools
 */
public class UserDAO extends HibernateDaoSupport implements IUserDAO{

	@Override
	public void AddUser(User model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteUser(User model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateUser(User model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User GetTaskByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> GetAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> GetUserBy(String userId, String name, String password,
			String power, String dept, String job, Set<?> records) {
		// TODO Auto-generated method stub
		return null;
	}
	
}