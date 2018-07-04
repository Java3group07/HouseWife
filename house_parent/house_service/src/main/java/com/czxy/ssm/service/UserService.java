package com.czxy.ssm.service;

import com.czxy.ssm.pojo.User;

public interface UserService {

	User update1(String username);

	void updatePwd(User user);

	int findUserNum();

}
