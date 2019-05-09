package com.ww.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.ww.pojo.PubUserBase;
import com.ww.service.PubUserBaseService;

import tk.mybatis.mapper.entity.Condition;

@Service
public class PubUserBaseServiceImpl extends BaseServiceImpl<PubUserBase> implements PubUserBaseService{

	@Override
	public void save(List<PubUserBase> models) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PubUserBase> findByCondition(Condition condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
