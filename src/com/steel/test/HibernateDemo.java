package com.steel.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.steel.entity.Cat;
import com.steel.util.HibernateUtil;


public class HibernateDemo {

	
	//@Test
	public void saveCat(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Cat cat = new Cat("Kitty","red","big" ,2);
		session.save(cat);
		tx.commit();
	}
	
	//@Test
	@SuppressWarnings("unchecked")
	public void getCat(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(Cat.class);
		criteria.setMaxResults(50);
		List<Cat> cats = criteria.list();
		tx.commit();
		HibernateUtil.closeSession();
		for(Cat cat:cats){
			System.out.println(cat.getId()+";"+cat.getName()+";"+cat.getColor()+";"+cat.getSize());
		}
	}
	
	//@Test
	@SuppressWarnings("unchecked")
	public void getCatByName(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(Cat.class);
		List<Cat> cats = (List<Cat>) criteria.add(Restrictions.like("name", "K%")).list();
		tx.commit();
		HibernateUtil.closeSession();
		for(Cat cat:cats){
			System.out.println(cat.getId()+";"+cat.getName()+";"+cat.getColor()+";"+cat.getSize()+";"+cat.getAge());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getCatByParams(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(Cat.class);
		List<Cat> cats = criteria.add(Restrictions.like("name", "l%"))
								  .add(Restrictions.or(
										  Restrictions.isNull("age"),
										  Restrictions.eq("age", new Integer(2))
										  )).list();
		tx.commit();
		HibernateUtil.closeSession();
		System.out.println(cats.size());
		for(Cat cat:cats){
			System.out.println(cat.getId()+";"+cat.getName()+";"+cat.getColor()+";"+cat.getSize()+";"+cat.getAge());
		}
		
	}
}
