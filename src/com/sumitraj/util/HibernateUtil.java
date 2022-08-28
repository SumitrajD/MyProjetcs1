package com.sumitraj.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static SessionFactory sessionFactory;
static {
	try {
		Configuration config=new Configuration();
		config.configure("com/sumitraj/resources/hibernate.cfg.xml");
		 sessionFactory=config.buildSessionFactory();
		 
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static SessionFactory getSessionFactory() {
	
	
	return sessionFactory;
	
}
}
