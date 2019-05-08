package com.ww.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.mapper.UsersMapper;
import com.ww.pojo.Users;
import com.ww.service.UsersService;

import tk.mybatis.mapper.entity.Condition;

@Service
public class UsersServiceImpl extends BaseServiceImpl<Users> implements UsersService{
	
	@Autowired 
	UsersMapper usersMapper;

	@Override
	public void save(List<Users> models) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> findByCondition(Condition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
