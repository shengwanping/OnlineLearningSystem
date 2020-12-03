package com.swp.service.impl;

import com.swp.dao.TeacherClassCourseDao;
import com.swp.entity.TeacherClassCourse;
import com.swp.service.TeacherClassCourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TeacherClassCourse)表服务实现类
 *
 * @author makejava
 * @since 2020-11-11 17:33:27
 */
@Service("teacherClassCourseService")
@Transactional //事务
public class TeacherClassCourseServiceImpl implements TeacherClassCourseService {
    @Resource
    private TeacherClassCourseDao teacherClassCourseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userNo
     * @return 实例对象
     */
    @Override
    public List<TeacherClassCourse> queryById(Integer userNo) {
        return this.teacherClassCourseDao.queryById(userNo);
    }


}