package com.wms.serviceImpl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.wms.dao.IUserDAO;
import com.wms.entity.User;
import com.wms.service.IUserService;

@Service("UserService")
public class UserService implements IUserService {
	private IUserDAO dao;

	public void setDao(IUserDAO dao) {
		this.dao = dao;
	}

	@Override
	public void AddUser(User model) {
		dao.AddUser(model);
	}

	@Override
	public void DeleteUser(User model) {
		dao.DeleteUser(model);
	}

	@Override
	public void UpdateUser(User model) {
		dao.UpdateUser(model);
	}

	@Override
	public User GetTaskByUserId(String userId) {
		return dao.GetTaskByUserId(userId);
	}

	@Override
	public List<User> GetAllUser() {
		return dao.GetAllUser();
	}

	@Override
	public List<User> GetUserBy(String userId, String name, String password,
			String power, String dept, String job, Set<?> records) {
		return dao.GetUserBy(userId, name, password, power, dept, job, records);
	}

}
