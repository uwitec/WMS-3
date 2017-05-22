package com.wms.service;

import java.util.List;
import java.util.Set;

import com.wms.entity.User;

public interface IUserService {

	void AddUser(User model);

	void DeleteUser(User model);

	void UpdateUser(User model);

	User GetTaskByUserId(String userId);

	List<User> GetAllUser();

	List<User> GetUserBy(String userId, String name, String password,
			String power, String dept, String job, Set<?> records);
}
