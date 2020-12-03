package com.swp.dao;

import com.swp.entity.PublishCourse;
import com.swp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-04 09:10:23
 */
@Mapper //这里和启动类MapperScan二选一就行,作用:使接口queryById在mapper中找到对应的id
public interface UserDao {

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