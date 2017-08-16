package com.baimi.routerweb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baimi.routerweb.datasource.DataSourceContextHolder;
import com.baimi.routerweb.datasource.DataSourceType;
import com.baimi.routerweb.entity.User;
import com.baimi.routerweb.mapper.UserMapper;
import com.baimi.routerweb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource(name = "userMapper")
	private UserMapper userMapper;

	@Override
	public User getUser(String euserPhone) {
		DataSourceContextHolder.setDbType(DataSourceType.SOURCE_MOP);
		return userMapper.getUser(euserPhone);
	}

}
