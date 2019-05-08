package com.ww.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.mapper.CountryMapper;
import com.ww.pojo.Country;
import com.ww.service.CountryService;

@Service
public  class CountryServiceImpl implements CountryService{
	
	@Autowired 
	CountryMapper countryMapper;

	public Country findCountryById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(id);
		return countryMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delectCountryById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		countryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void insertCountry(Country country) throws Exception {
		// TODO Auto-generated method stub
		countryMapper.insert(country);
	}

	@Override
	public void updateCountry(Country country) throws Exception {
		// TODO Auto-generated method stub
		countryMapper.updateByPrimaryKey(country);
	}

}
