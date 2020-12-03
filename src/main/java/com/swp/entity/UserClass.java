package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (UserClass)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserClass implements Serializable {
    private static final long serialVersionUID = -63863771587483297L;
    /**
    * id
    */
    private Integer userClassId;
    /**
    * 班级编号
    */
    private Integer classNo;
    /**
    * 用户编号
    */
    private Integer userNo;



}