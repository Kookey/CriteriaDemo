package com.steel.test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.steel.entity.Worker;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session  session = sf.openSession();
		Criteria crit = session.createCriteria(Worker.class);
		Worker w = (Worker) crit.uniqueResult();
		System.out.println(w.getFirstName());
		session.close();
	}

}
