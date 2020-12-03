package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Progress)实体类
 *
 * @author makejava
 * @since 2020-11-25 15:55:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Progress implements Serializable {
    private static final long serialVersionUID = 474315402069945879L;
    /**
    * id
    */
    private Integer progressId;
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
    * 进度
    */
    private Integer maxTime;

}