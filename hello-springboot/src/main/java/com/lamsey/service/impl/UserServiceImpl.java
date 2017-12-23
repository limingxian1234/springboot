package com.lamsey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamsey.domain.User;
import com.lamsey.mapper.UserMapper;
import com.lamsey.service.UserService;

/** 
 * 类名：UserServiceImpl
 * 功能：
 * 详细：
 * 作者 :limingxian
 * 版本：1.0 
 * 创建时间：2017年12月23日 上午9:09:24
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getAll() {
		List<User> list = userMapper.getAll();
		return list;
	}

	@Override
	public User getOne(Long id) {
		User user = userMapper.getOne(id);
		return user;
	}

	@Override
	public void insert(User user) {
	
		userMapper.insert(user);
		
	}

	@Override
	public void update(User user) {
		
		userMapper.update(user);
	}

	@Override
	public void delete(Long id) {
		
		userMapper.delete(id);
	}
	
	
}
