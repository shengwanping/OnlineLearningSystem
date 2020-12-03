package com.swp.service;

import com.swp.entity.TeacherClassCourse;

import java.util.List;

/**
 * (TeacherClassCourse)表服务接口
 *
 * @author makejava
 * @since 2020-11-11 17:33:27
 */
public interface TeacherClassCourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param userNo
     * @return 实例对象
     */
    List<TeacherClassCourse> queryById(Integer userNo);
}