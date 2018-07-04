package com.czxy.house.service;

import com.czxy.house.domain.User;

public interface UserService {

	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public User regist(User user);
	
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public User login(User user);


	User update1(String username);

	/**
	 * 修改密码
	 * @param user
	 */
	void updatePwd(User user);

	int findUserNum();
}
