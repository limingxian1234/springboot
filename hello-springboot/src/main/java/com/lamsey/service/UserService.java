package com.lamsey.service;

import java.util.List;

import com.lamsey.domain.User;

/** 
 * 类名：UserService.java
 * 功能：
 * 详细：
 * 作者 :limingxian
 * 版本：1.0 
 * 创建时间：2017年12月23日 上午9:08:44
 */
public interface UserService {
	
	 List<User> getAll();

	 User getOne(Long id);
	
	 void insert(User user);
	
	 void update(User user);
	
	 void delete(Long id);
}
