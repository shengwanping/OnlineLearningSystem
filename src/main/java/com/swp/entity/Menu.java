package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Menu)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable {
    private static final long serialVersionUID = -35773946699526084L;
    /**
    * 菜单id
    */
    private Integer menuId;
    /**
    * 父级id
    */
    private Integer parentId;
    /**
    * 菜单图标
    */
    private String menuIcon;
    /**
    * 菜单链接
    */
    private String menuLink;
    /**
    * 菜单级别
    */
    private Integer menuLevel;
    /**
    * 菜单名称
    */
    private String menuName;




}