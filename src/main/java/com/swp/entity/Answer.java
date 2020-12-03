package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Answer)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:11:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer implements Serializable {
    private static final long serialVersionUID = 938243387734820249L;
    /**
    * 答案id
    */
    private Integer answerId;
    /**
    * 用户编号
    */
    private Integer userNo;
    /**
    * 课程id
    */
    private Integer courseId;
    /**
    * 测试章节
    */
    private String testSection;
    /**
    * 测试题目
    */
    private String testTopic;
    /**
    * 选择答案
    */
    private String optionAnswer;



}