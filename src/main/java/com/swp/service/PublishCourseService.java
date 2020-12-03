package com.swp.service;

import com.swp.entity.PublishCourse;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * (PublishCourse)表服务接口
 *
 * @author makejava
 * @since 2020-11-13 06:13:38
 */
public interface PublishCourseService {



    /**
     * 新增数据
     *
     * @param publishCourse 实例对象
     * @return 实例对象
     */
    Integer  insert(List<PublishCourse> publishCourse);

    /**
     * 查看老师的所有课程
     *
     * @param userNo 实例对象
     * @return 实例对象PublishCourse
     */
    List<PublishCourse>  selectAll(Integer userNo,String courseName);
    /**
     * 管理员查看所有课程
     *
     * @param courseName 实例对象
     * @return 实例对象PublishCourse
     */
    List<PublishCourse>  selectAll2(String courseName);
    /**
     * 删除选中课程
     *
     * @param publishCourse 实例对象
     * @return 单条数据
     */
    Integer deleteOne(PublishCourse publishCourse);

    /**
     * 通过学号,课程号查询一门课程
     *
     * @param userNo 主键
     * @return 集合
     */
    List<PublishCourse> querySingleCourse(Integer userNo, Integer courseId);

    /**
     * 管理员修改课程状态
     *
     */
    Integer updateCourseStatus( Integer userNo, Integer courseId,Integer status);




}