package com.steel.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.steel.entity.Worker;
import com.steel.util.SessionFactoryUtil;


public class HibernateDemo {

	/*
	 * 
	 */
	@Test
	public void saveWorker(){
		
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Worker worker = new Worker();
		worker.setFirstName("dongmei");
		worker.setLastName("hou");
		worker.setSalary(4000);
		session.save(worker);
		tx.commit();
	}
}
