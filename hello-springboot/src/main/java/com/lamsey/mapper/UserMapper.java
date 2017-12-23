package com.lamsey.mapper;

import java.util.List;

import com.lamsey.domain.User;

/** 
 * 类名：UserMapper.java
 * 功能：
 * 详细：
 * 作者 :limingxian
 * 版本：1.0 
 * 创建时间：2017年12月22日 下午10:28:52
 */
public interface UserMapper {
	 List<User> getAll();

	 User getOne(Long id);
	
	 void insert(User user);
	
	 void update(User user);
	
	 void delete(Long id);
}
