package com.czxy.ssm.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.czxy.ssm.pojo.User;

import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
@Select("select * from h_user where username=#{username}")
	User update1(String username);
@Update("UPDATE h_user SET PASSWORD=#{password} WHERE uid=#{uid}")
void updatePwd(User user);

@Select("select count(*) from h_user")
int findUserNum();

}
