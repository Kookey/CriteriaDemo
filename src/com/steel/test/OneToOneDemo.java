package com.steel.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.steel.entity.Address;
import com.steel.entity.Person;
import com.steel.util.HibernateUtil;

/**
 * 通过表的主键双向关联的OneToOne
 * @author admin
 *
 */
public class OneToOneDemo {

	@Test
	public void oneToOne(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		Person person = new Person();
		person.setName("Wendy");
		
		Address address = new Address();
		address.setDetail("中山北一路");
		
		person.setAddress(address);
		address.setPerson(person);
		session.saveOrUpdate(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}
