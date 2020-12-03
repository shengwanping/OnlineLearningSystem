package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Test)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:24:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test implements Serializable {
    private static final long serialVersionUID = 819013484534508745L;
    /**
    * 测试id
    */
    private Integer testId;
    /**
    * 教师id
    */
    private Integer userNo;
    /**
     * 课程id
     */
    private Integer courseId;
    /**
     * 课程章节
     */
    private String courseSection;
    /**
    * 测试题目
    */
    private String testTopic;
    /**
    * 测试选项A
    */
    private String testOptionA;
    /**
    * 测试选项B
    */
    private String testOptionB;
    /**
    * 测试选项C
    */
    private String testOptionC;
    /**
    * 测试选项D
    */
    private String testOptionD;
    /**
    * 测试答案
    */
    private String testAnswer;

    private Answer answer;//与答案一对一
    private Score score;//与成绩多对一

}