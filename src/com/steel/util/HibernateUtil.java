package com.steel.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;
	
	static{
		Configuration configuration = new Configuration();
		configuration.configure();
		serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	
	@SuppressWarnings("rawtypes")
	public static final ThreadLocal session = new ThreadLocal();
	
	@SuppressWarnings("unchecked")
	public static Session currentSession() {
		Session sess = (Session) session.get();
		if(sess==null){
			sess = sessionFactory.openSession();
			session.set(sess);
		}
		return sess;
	}
	
	@SuppressWarnings("unchecked")
	public static void closeSession(){
		Session s = (Session) session.get();
		if(s!=null)
			s.close();
		session.set(null);
	}
}
