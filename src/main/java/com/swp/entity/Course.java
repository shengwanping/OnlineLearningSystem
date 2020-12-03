package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:24:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    private static final long serialVersionUID = 136660418680770798L;
    /**
    * 课程id
    */
    private Integer courseId;
    /**
    * 课程名称
    */
    private String courseName;
    /**
     * 课程背景图片链接
     */
    private String courseLink;

    private TeacherClassCourse teacherClassCourse;//一个班的一门课程对应一个老师

    private List<PublishCourse> publishCourse;//一个班的一门课程对应多个章节

}