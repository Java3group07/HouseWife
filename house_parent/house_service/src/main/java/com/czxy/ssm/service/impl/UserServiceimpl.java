package com.czxy.ssm.service.impl;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czxy.ssm.dao.UserMapper;
import com.czxy.ssm.pojo.User;
import com.czxy.ssm.service.UserService;
@Service
@Transactional
public class UserServiceimpl implements UserService{
@Resource
private UserMapper userMapper;

@Override
public User update1(String username) {
	User user= userMapper.update1(username);
	return user;
	
}

@Override
public void updatePwd(User user) {
	userMapper.updatePwd(user);
	
}

@Override
public int findUserNum() {
	int num = userMapper.findUserNum();
	return num;
}
}
