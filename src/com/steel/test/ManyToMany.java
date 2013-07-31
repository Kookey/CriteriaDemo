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

import com.steel.entity.ManyCourse;
import com.steel.entity.ManyStudent;
import com.steel.util.HibernateUtil;

public class ManyToMany {

	//@Test
	public void ManyToManyTest(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		ManyStudent manyStudent = new ManyStudent();
		manyStudent.setSname("王二");
		manyStudent.setSage("23");
		Set<ManyCourse> courseSet = new HashSet<ManyCourse>();
		ManyCourse manyCourse = null;
		for(int i=0;i<2;i++){
			manyCourse = new ManyCourse();
			if(i==0)
				manyCourse.setCname("语文");
			if(i==1)
				manyCourse.setCname("数学");
			courseSet.add(manyCourse);
		}
		manyStudent.setManyCourse(courseSet);
		session.save(manyStudent);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	@Test
	public void doQuery(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		String hql = "from ManyStudent";
		Query query = session.createQuery(hql);
		List<ManyStudent> list = new ArrayList<ManyStudent>();
		list = query.list();
		ManyStudent manyStudent = null;
		ManyCourse manyCourse = null;
		for (int i=0;i<list.size();i++) {
			manyStudent = new ManyStudent();
			manyStudent = list.get(i);
			System.out.println("姓名:"+manyStudent.getSname()+";年龄:"+manyStudent.getSage());
			System.out.println("所选课程:");
			Iterator ite = manyStudent.getManyCourse().iterator();
			while(ite.hasNext()){
				manyCourse = (ManyCourse) ite.next();
				System.out.println("课程名:"+manyCourse.getCname());
			}
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
}
