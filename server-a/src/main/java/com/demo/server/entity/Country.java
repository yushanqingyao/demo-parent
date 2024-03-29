package com.demo.server.entity;

import com.demo.server.model.CountryCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "`country`")
public class Country {
    /**
     * 主键
     */
    @Id
//    首先需要数据库支持自增，其次数据库提供的 JDBC 支持 getGeneratedKeys 方法
//    <insert id="insert" useGeneratedKeys="true" keyProperty="id">
    @KeySql(useGeneratedKeys = true)

//    需要数据库支持自增
//    <insert id="insertAuthor"><selectKey keyProperty="id" resultType="int" order="AFTER">SELECT LAST_INSERT_ID()</selectKey></insert>
//    @KeySql(dialect = IdentityDialect.MYSQL)

//    Oracle 通过序列获取主键
//    <insert id="insertAuthor"><selectKey keyProperty="id" resultType="int" order="BEFORE">select SEQ_ID.nextval from dual</selectKey></insert>
//    @KeySql(sql = "select SEQ_ID.nextval from dual", order = ORDER.BEFORE)
    private Integer id;

    /**
     * 名称
     */
    private String countryName;

    /**
     * 代码
     */
    private CountryCodeEnum countryCode;
    private Date creatTime;
    private Date updateTime;
    private Date version;

}