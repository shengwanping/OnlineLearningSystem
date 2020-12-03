package com.swp.service.impl;

import com.swp.dao.MenuDao;
import com.swp.entity.Menu;
import com.swp.entity.User;
import com.swp.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Menu)表服务实现类
 *
 * @author makejava
 * @since 2020-11-09 10:00:00
 */
@Service("menuService")
@Transactional //事务
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;

    /**
     * 通过用户名，密码获取角色，查询相应菜单
     *
     * @param user 主键
     * @return 对象列表
     */
    public List<Menu> menuList(User user){
        return menuDao.menuList(user);
    };

}