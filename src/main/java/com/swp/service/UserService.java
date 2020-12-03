package com.swp.service;

import com.swp.entity.PublishCourse;
import com.swp.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2020-11-04 09:10:24
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userNo 主键
     * @return 实例对象
     */
    User queryById(Integer userNo);

    /**
     * 通过学号查询所有课程
     *
     * @param userNo 主键
     * @return 集合
     */
    List<User> queryAllCourse(Integer userNo);

    /**
     * 分页查询
     */
    List<User> queryLimitStudent(Integer index,Integer count);


}