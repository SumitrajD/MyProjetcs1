package com.sumitraj.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sumitraj.pojo.User;
import com.sumitraj.util.HibernateUtil;

public class UserServiceImpl implements UserService {

	@Override
	public String checkLogin(String uname, String upass) {
		String status=" ";
		
		try {
			SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
			Session session=sessionFactory.openSession();
			
			User user=(User) session.get(User.class, uname);
			if(user==null)
			{
				status="failure";
			}else {
				if(user.getUpass().equals(upass)) {
					status="success";
				}else {
					status="failure";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
