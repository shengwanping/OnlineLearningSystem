package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-11-09 08:41:54
 */
@Data
@AllArgsConstructor //生成全参构造器。
@NoArgsConstructor
public class Role implements Serializable {
    private static final long serialVersionUID = 713125305211802764L;
    /**
    * 角色id
    */
    private Integer roleId;
    /**
    * 角色编号
    */
    private Integer roleNo;
    /**
    * 角色名称
    */
    private String roleName;




}