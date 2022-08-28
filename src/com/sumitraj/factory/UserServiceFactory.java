package com.sumitraj.factory;

import com.sumitraj.service.UserService;
import com.sumitraj.service.UserServiceImpl;

public class UserServiceFactory {
private static UserService userService;

	static {
		userService=new UserServiceImpl();
	}
	public static UserService getUserService() {
		return userService;
	}
	
}
