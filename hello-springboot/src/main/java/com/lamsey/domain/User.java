package com.lamsey.domain;

import java.io.Serializable;

import com.lamsey.enums.UserSexEnum;

/** 
 * 类名：User
 * 功能：
 * 详细：
 * 作者 :limingxian
 * 版本：1.0 
 * 创建时间：2017年12月22日 下午8:42:49
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String userName;
	private String passWord;
	private UserSexEnum userSex;
	private String nickName;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(Long id, String userName, String passWord, UserSexEnum userSex,
			String nickName) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.userSex = userSex;
		this.nickName = nickName;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassWord() {
		return passWord;
	}



	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	public UserSexEnum getUserSex() {
		return userSex;
	}



	public void setUserSex(UserSexEnum userSex) {
		this.userSex = userSex;
	}



	public String getNickName() {
		return nickName;
	}



	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord="
				+ passWord + ", userSex=" + userSex + ", nickName=" + nickName
				+ "]";
	}
	
	
}
