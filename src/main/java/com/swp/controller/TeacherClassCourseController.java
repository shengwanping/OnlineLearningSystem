package com.swp.controller;

import com.swp.entity.TeacherClassCourse;
import com.swp.service.TeacherClassCourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TeacherClassCourse)表控制层
 *
 * @author makejava
 * @since 2020-11-11 17:33:27
 */
@RestController
@RequestMapping("teacherClassCourse")
public class TeacherClassCourseController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherClassCourseService teacherClassCourseService;

    /**
     * 通过主键查询单条数据
     *
     * @param userNo
     * @return 查询某教师所教课程
     */
    @GetMapping("selectOne")
    public List<TeacherClassCourse> selectOne(@RequestParam(value = "userNo") Integer userNo) {
        return this.teacherClassCourseService.queryById(userNo);
    }

}