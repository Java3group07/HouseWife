package com.czxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czxy.house.dao.UserMapper;
import com.czxy.house.domain.User;
import com.czxy.house.service.UserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	
		/**
		 * 注册
		 */
		public User regist(User user) {
			
			Example example = new Example(User.class);
			Criteria createCriteria = example.createCriteria();
			createCriteria.andEqualTo("phone", user.getPhone());
			List<User> result = userMapper.selectByExample(example);
			if (!(result.size() > 0)) {
				userMapper.insert(user);
				return user;
			}
			return null;
			
		}
	
	
	/**
	 *登录
	 */
	public User login(User user) {
		List<User> list = userMapper.selectAll();
		for (User u : list) {
			if(u.getPhone().equals(user.getPhone())&&u.getPassword().equals(user.getPassword())){
				return u;
			}
		}
		return null;
	}

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
