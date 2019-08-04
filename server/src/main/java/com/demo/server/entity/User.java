package com.demo.server.entity;

import com.demo.server.lib.mybatis.SimpleGenId;
import com.demo.server.model.Address;
import com.demo.server.model.StateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @KeySql(genId = SimpleGenId.class)
    private Long id;

    private String name;

    @Column
    private Address address;
    @Column
    private StateEnum state;

}
