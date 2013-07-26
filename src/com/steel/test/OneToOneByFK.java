package com.steel.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.steel.entity.Room;
import com.steel.entity.UserInfo;
import com.steel.util.HibernateUtil;

public class OneToOneByFK {

	@Test
	public void oneToOneByFk(){
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(1L);
		userInfo.setName("杨过");
		
		Room room = new Room();
		room.setRoomId(1L);
		room.setAddress("5F306");
		
		userInfo.setRoom(room);
		room.setUserInfo(userInfo);
		
		session.save(userInfo);
		tx.commit();
		HibernateUtil.closeSession();
	}
}
