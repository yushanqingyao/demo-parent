package com.demo.server.mapper;

import com.demo.server.entity.User;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User>, InsertListMapper<User> {
}