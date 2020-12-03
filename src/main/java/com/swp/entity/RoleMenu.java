package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (RoleMenu)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:11:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleMenu implements Serializable {
    private static final long serialVersionUID = -38742996920221211L;
    /**
    * 角色编号
    */
    private Integer roleNo;
    /**
    * 菜单id
    */
    private Integer menuId;


    public Integer getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(Integer roleNo) {
        this.roleNo = roleNo;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}