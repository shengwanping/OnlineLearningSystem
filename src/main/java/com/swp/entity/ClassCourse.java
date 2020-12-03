package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (ClassCourse)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassCourse implements Serializable {
    private static final long serialVersionUID = 155655371741505594L;
    /**
    * 课程id
    */
    private Integer courseId;
    /**
    * 班级编号
    */
    private Integer classNo;


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

}