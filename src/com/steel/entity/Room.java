package com.steel.entity;

import java.io.Serializable;

/**
 * 
 * @author admin
 *
 */
public class Room implements Serializable{

	private static final long serialVersionUID = -660561912304872632L;
	
	private Long roomId;
	private String address;
	private UserInfo userInfo;
	
	public Room() {
	}
	
	public Long getRoomId() {
		return roomId;
	}
	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
}
