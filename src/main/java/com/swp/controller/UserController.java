package com.swp.controller;

import com.swp.entity.PublishCourse;
import com.swp.entity.User;
import com.swp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-11-04 09:10:25
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param userNo 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(@RequestParam("userNo") Integer userNo) {

        return this.userService.queryById(userNo);
    }

    /**
     * 通过学号查询所有课程
     *
     * @param userNo 主键
     * @return 集合
     */
    @GetMapping("queryAllCourse")
    public List<User> queryAllCourse(@RequestParam("userNo") Integer userNo){
        return this.userService.queryAllCourse(userNo);
    };

    /**
     * 分页查询
     */
    @GetMapping("queryLimitStudent")
    public List<User> queryLimitStudent(@RequestParam("index") Integer index,@RequestParam("count")Integer count){
        return this.userService.queryLimitStudent(index,count);
    };





}