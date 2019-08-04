package com.demo.server.mapper;

import com.demo.server.entity.User;
import com.demo.server.model.Address;
import com.demo.server.model.StateEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    public void testAdd(){
        Address address1 = new Address();
        address1.setProvince("Hebei");
        address1.setCity("Shijiazhuang");

        Address address2 = new Address();
        address2.setProvince("Hebei");
        address2.setCity("Handan");

        List<User> users = new ArrayList<User>();

        users.add(User.builder().name("abel533").address(address1).state(StateEnum.enabled).build());
        users.add(User.builder().name("isea533").address(address2).state(StateEnum.disabled).build());

        mapper.insertList(users);
    }

    @Test
    public void testSelect(){
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("name", 100);
        List<User> users = mapper.selectByExample(example);
        for (User user : users) {
            System.out.println(user);
        }
    }



}
