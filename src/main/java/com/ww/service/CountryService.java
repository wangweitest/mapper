package com.ww.service;

import com.ww.pojo.Country;

public interface CountryService {
	// 查找
	public Country findCountryById(Integer id) throws Exception;

	// 删除
	public void delectCountryById(Integer id) throws Exception;

	// 插入
	public void insertCountry(Country country) throws Exception;

	// 修改
	public void updateCountry(Country country) throws Exception;

}
