package com.demo.server.service.impl;

import com.demo.server.entity.Country;
import com.demo.server.entity.User;
import com.demo.server.mapper.primary.CountryMapper;
import com.demo.server.mapper.second.UserMapper;
import com.demo.server.model.CountryCodeEnum;
import com.demo.server.service.DemoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private CountryMapper countryMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void add() {
        Country t = Country.builder().countryCode(CountryCodeEnum.EN).countryName("美国").build();
        countryMapper.insertSelective(t);
        PageHelper.startPage(1,10);

        Page<Country> page = PageHelper.startPage(1, 10).doSelectPage(()-> userMapper.selectAll());
        List<Country> result = page.getResult();

    }
}
