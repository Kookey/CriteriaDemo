package com.steel.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
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
	
	//@Test
	public void Test(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		
		student.setsName("小强");
		student.setsAge("23");
		Set<Book> bookSet = new HashSet<Book>();
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
	
	@SuppressWarnings("unchecked")
	@Test
	public void QueryStudent(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		List<Student> slist = new ArrayList<Student>();
		
		String hql = "select s from Student as s";
		Query q = session.createQuery(hql);
		slist = q.list();
		
		Student s = null;
		Book b = null;
		for(int i=0;i<slist.size();i++){
			s = slist.get(i);
			System.out.println("学生姓名:"+s.getsName()+";年龄"+s.getsAge());
			Set<?> book = s.getBook();
			Iterator<?> it = book.iterator();
			
			while(it.hasNext()){
				b = (Book) it.next();
				System.out.println("书本名字:"+b.getbName()+";价格:"+b.getbPrice());
			}
		}
		
		tx.commit();
		HibernateUtil.closeSession();
	}
}
