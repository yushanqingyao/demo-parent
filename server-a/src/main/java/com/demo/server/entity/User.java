package com.demo.server.entity;

import com.demo.server.lib.mybatis.UUIdGenId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "`t_user`")
public class User {
    /**
     * ID
     */
    @Id
    @KeySql( genId = UUIdGenId.class)
    private String id;

    /**
     * 商户ID
     */
    private String partnerId;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 登录邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 用户类型，1-商户主账号、2-商户子账号
     */
    private Integer userType;

    /**
     * 状态，1-正常、2-冻结
     */
    private Byte status;

    /**
     * 数据创建时间戳
     */
    private Integer ctime;

    /**
     * 数据最近更新的时间戳
     */
    private Integer mtime;

    /**
     * 拓展字段
     */
    private String ext;


}