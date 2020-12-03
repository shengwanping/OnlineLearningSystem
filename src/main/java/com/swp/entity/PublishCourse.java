package com.swp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (PublishCourse)实体类
 *
 * @author makejava
 * @since 2020-11-13 06:13:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublishCourse implements Serializable {
    private static final long serialVersionUID = -37248253102729416L;
    /**
    * 发布课程id
    */
    private Integer publishCourseId;
    /**
    * 课程id
    */
    private String courseId;
    /**
    * 课程章节
    */
    private String courseSection;
    /**
    * 章节视频
    */
    private String sectionVideo;
    /**
    * 章节课件）
    */
    private String sectionCourseware;

    /**
    * 课程状态
    */
    private String courseStatus;
    /**
    * 课程学期
    */
    private Integer userNo;
    /**
    * 开始时间
    */
    private String startTime;
    /**
    * 结束时间
    */
    private String endTime;
    private String newDate;//创建时间
    private Course course;//课程表关联
    private User user;//关联教师

}