package com.wms.action;

import com.wms.service.IUserService;

/**
 * 用户信息表
 * 
 * @author Administrator
 * 
 */
public class UserAction {

	IUserService service;

	public IUserService getService() {
		return service;
	}

	public void setService(IUserService service) {
		this.service = service;
	}

	public String login() {
		System.out.println("=--------");
		return "login_in";
	}

	public void exit() {
		System.out.println("------------test ajax!!------------");
	}

	public String queryUser() {
		return "queryUser";
	}

	public String addUser() {
		return "addUser";
	}

	public String upDateUser() {
		return "upDateUser";
	}

	public String deleteUser() {
		return "deleteUser";
	}
}
