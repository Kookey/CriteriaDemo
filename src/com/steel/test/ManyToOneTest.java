package com.steel.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.steel.entity.Dormitory;
import com.steel.entity.User;
import com.steel.util.HibernateUtil;


public class ManyToOneTest {

//	@Test
	public void ManyToOne(){
		
		Dormitory dorm1 = new Dormitory();
		dorm1.setAddress("3F004");
		
		User user1 = new User();
		user1.setName("小红");
		user1.setDorm(dorm1);
		
		User user2 = new User();
		user2.setName("小明");
		user2.setDorm(dorm1);
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		session.save(user1);
		session.save(user2);
		
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	@Test
	public void loadUser(){
		
		Session session = HibernateUtil.currentSession();
		Transaction tc = session.beginTransaction();
		
		User user = (User) session.load(User.class, new Integer(1));
		
		if(user != null){
			System.out.println("姓名:"+user.getName()+";宿舍:"+user.getDorm().getAddress());
		}
		tc.commit();
		HibernateUtil.closeSession();
	}
}
