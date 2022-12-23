package com.cms;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

//util class
public class HibernateUtil {

	// sessionfactory object
	private static SessionFactory sessionFactory;

	// configure with session factory
	static {
		try {
			sessionFactory= new Configuration().configure("com/cms/hibernate.cfg.xml").buildSessionFactory();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	// return sessionfactory method
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}