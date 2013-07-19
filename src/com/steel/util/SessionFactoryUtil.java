package com.steel.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory;
	
	private SessionFactoryUtil(){}
	
	static{
		// 使用xml文件或者注解方式加载hibernate配置
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		//只是用xml文件方式加载hibernate配置
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getInstance(){
		return sessionFactory;
	}
	
	/**
	 * 打开会话但不绑定到会话上下文中
	 * @return
	 */
	public Session openSession(){
		return sessionFactory.openSession();
	}
	/** 
	* 从会话上下文中返回会话，如果上下文中不存在会话示例则先创建一个会话示例并保存到上下文中，然后再返回。 
	* <br> 
	* 会话上下文与hibernate配置中的current_session_context_class属性值有关。 
	* @return the session 
	*/  

	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * 关闭会话工厂
	 */
	public static void close(){
		if(sessionFactory!=null)
		sessionFactory.close();
		sessionFactory = null;
	}
}
