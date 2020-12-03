package com.swp.service.impl;

import com.swp.dao.UserDao;
import com.swp.entity.PublishCourse;
import com.swp.entity.User;
import com.swp.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-11-04 09:10:25
 */
@Service("userService")
@Transactional //事务
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userNo 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer userNo) {
        return this.userDao.queryById(userNo);
    }

    /**
     * 通过学号查询所有课程
     *
     * @param userNo 主键
     * @return 集合
     */
    @Override
    public List<User> queryAllCourse(Integer userNo) {
        return userDao.queryAllCourse(userNo);
    }

    /**
     * 分页查询
     */
    @Override
    public List<User> queryLimitStudent(Integer index,Integer count){
        return this.userDao.queryLimitStudent(index,count);
    };

}