package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole implements Serializable {
    private static final long serialVersionUID = -74314128844990701L;
    /**
    * 用户编号
    */
    private Integer userNo;
    /**
    * 角色编号
    */
    private Integer roleNo;


    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(Integer roleNo) {
        this.roleNo = roleNo;
    }

}