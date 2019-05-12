package com.ww.serviceImpl;

import com.ww.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ww.mapper.CountryMapper;
import com.ww.service.CountryService;

@Service
public class CountryServiceImpl extends BaseServiceImpl<Country> implements CountryService{
    
    @Autowired 
    CountryMapper countryMapper;


}