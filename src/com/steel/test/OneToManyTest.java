package com.steel.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.steel.entity.Book;
import com.steel.entity.Student;
import com.steel.util.HibernateUtil;

public class OneToManyTest {

//	public static void main(String[] args) {
//		OneToManyTest test = new OneToManyTest();
//		test.Test();
//	}
	
	@Test
	public void Test(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		
		student.setsName("小强");
		student.setsAge("23");
		Set bookSet = new HashSet();
		Book book = null;
		
		for(int i=0;i<4;i++){
			book = new Book();
			book.setbName("Java宝典"+i);
			book.setbPrice("50");
			bookSet.add(book);
		}
		student.setBook(bookSet);
		session.saveOrUpdate(student);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
}
