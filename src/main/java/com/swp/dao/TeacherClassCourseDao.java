package com.swp.dao;

import com.swp.entity.TeacherClassCourse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * (TeacherClassCourse)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-11 17:33:27
 */
@Mapper
public interface TeacherClassCourseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userNo
     * @return 实例对象
     */
    List<TeacherClassCourse> queryById(Integer userNo);

}