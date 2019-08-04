package com.demo.server.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CountryMapperTest {


    @Autowired
    private CountryMapper mapper;

    @Test
    public void testExample(){
        Example example = new Example(Country.class);
        //待行锁释放之后，返回查询结果
        example.setForUpdate(true);
        example.createCriteria().andGreaterThan("id", 100).andLessThan("id",151);
        example.or().andLessThan("id", 41);


        List<Country> countries = mapper.selectByExample(example);
    }


}
