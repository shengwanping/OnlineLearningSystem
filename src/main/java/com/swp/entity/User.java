package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -40445637187637383L;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 用户密码
    */
    private String passWord;
    /**
    * 用户编号
    */
    private Integer userNo;
    /**
    * 姓名
    */
    private String name;
    /**
    * 用户年龄
    */
    private String userAge;
    /**
    * 用户性别
    */
    private String userSex;
    /**
    * 用户电子邮箱
    */
    private String userEmail;
    /**
    * 用户联系电话
    */
    private String userPhone;

    private Class studentClass;


}