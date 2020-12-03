package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Score)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:24:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score implements Serializable {
    private static final long serialVersionUID = -77937210835587202L;
    /**
    * 分数id
    */
    private Integer scoreId;
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
    * 测试章节分数
    */
    private String testSectionScore;
    /**
     * 最长时间
     */
    private Integer maxTime;
}