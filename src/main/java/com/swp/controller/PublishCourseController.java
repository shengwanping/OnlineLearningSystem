package com.swp.controller;

import com.swp.entity.PublishCourse;
import com.swp.service.PublishCourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PublishCourse)表控制层
 *
 * @author makejava
 * @since 2020-11-13 06:13:38
 */
@RestController
@RequestMapping("publishCourse")
public class PublishCourseController {
    /**
     * 服务对象
     */
    @Resource
    private PublishCourseService publishCourseService;

    /**
     * 老师创建课程
     *
     * @param ruleForm 实例对象
     * @return 单条数据
     */
    @PostMapping("insert")
    public Integer insert(@RequestBody(required = false) List<PublishCourse> ruleForm) {
        //System.out.println(ruleForm);
        return this.publishCourseService.insert(ruleForm);
    }

    /**
     * 查看老师的所有课程
     *
     * @param userNo 实例对象
     * @return 单条数据
     */
    @GetMapping("selectAll")
    public List<PublishCourse> selectAll(@RequestParam("userNo") Integer userNo,@RequestParam("courseName") String courseName) {
        return this.publishCourseService.selectAll(userNo,courseName);
    }
    /**
     * 管理员查看所有课程
     *
     * @param courseName 实例对象
     * @return 单条数据
     */
    @GetMapping("selectAll2")
    public List<PublishCourse> selectAll2( String courseName) {
        return this.publishCourseService.selectAll2(courseName);
    }
    /**
     * 删除选中课程
     *
     * @param publishCourse 实例对象
     * @return 单条数据
     */
    @PostMapping("deleteOne")
    public Integer deleteOne(@RequestBody(required = false) PublishCourse publishCourse) {
        return this.publishCourseService.deleteOne(publishCourse);
    }

    /**
     * 通过学号,课程号查询一门课程
     * @return 集合
     */
    @GetMapping("querySingleCourse")
    public List<PublishCourse> querySingleCourse(@RequestParam("userNo") Integer userNo, @RequestParam("courseId") Integer courseId){
        return this.publishCourseService.querySingleCourse(userNo,courseId);
    };

    /**
     * 管理员修改课程状态
     *
     */
    @GetMapping("updateCourseStatus")
    public Integer updateCourseStatus(Integer userNo,Integer courseId,Integer status){
        return this.publishCourseService.updateCourseStatus(userNo,courseId,status);
    };

}