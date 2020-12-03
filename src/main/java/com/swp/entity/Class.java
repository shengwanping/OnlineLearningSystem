package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * (Class)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:24:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class implements Serializable {
    private static final long serialVersionUID = 503013350016976316L;
    /**
    * 班级id
    */
    private Integer classId;
    /**
    * 班级编号
    */
    private Integer classNo;
    /**
    * 班级名称
    */
    private String className;
    /**
    * 学院
    */
    private String college;
    /**
    * 年级
    */
    private String grade;

    private List<Course> courses; //一个班级多个课程



}