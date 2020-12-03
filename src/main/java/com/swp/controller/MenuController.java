package com.swp.controller;

import com.swp.entity.Menu;
import com.swp.entity.User;
import com.swp.service.MenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Menu)表控制层
 *
 * @author makejava
 * @since 2020-11-09 09:58:04
 */
@RestController
@RequestMapping("menu")
public class MenuController {
    /**
     * 服务对象
     */
    @Resource
    private MenuService menuService;

    /**
     * 通过用户名，密码获取角色，查询相应菜单
     *
     * @param user 主键
     * @return 对象列表
     */

    @PostMapping( "list") //登录成功根据角色返回菜单
    public List<Menu> queryAll(@RequestBody(required = false) User user) {
        return menuService.menuList(user);
    }

}