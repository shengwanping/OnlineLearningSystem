package com.swp.dao;

import com.swp.entity.Menu;
import com.swp.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Menu)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-09 10:00:00
 */
@Mapper
public interface MenuDao {

    /**
     * 通过用户名，密码获取角色，查询相应菜单
     *
     * @param user 主键
     * @return 对象列表
     */
    List<Menu> menuList(User user);

}