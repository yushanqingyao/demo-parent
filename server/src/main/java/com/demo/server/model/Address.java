package com.demo.server.model;

import com.demo.server.lib.mybatis.Obj2StrConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Obj2StrConverter {
    private String province;
    private String city;


    @Override
    public String buildSqlParam() {
        StringBuilder builder = new StringBuilder();
        if(province != null && province.length() > 0){
            builder.append(province);
        }
        if(city != null && city.length() > 0){
            builder.append("/").append(city);
        }
        return builder.toString();
    }

    @Override
    public void buildResultObj(String data) {

    }
}
