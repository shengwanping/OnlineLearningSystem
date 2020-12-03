package com.swp.dao;

import com.swp.entity.Progress;
import com.swp.entity.TeacherClassCourse;
import com.swp.entity.UserClass;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (Progress)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-25 18:58:15
 */
public interface ProgressDao {

    /**
     * 查看某一学生，一门课程的总学习进度
     */
    Integer queryALLProgress(Progress progress);

    List<TeacherClassCourse> teacherQueryProgress(Integer userNo);
    List<TeacherClassCourse> teacherQueryProgress_1(Integer userNo,Integer courseId);
    List<UserClass> teacherQueryProgress_2(Integer classNo);
    Integer teacherQueryProgress_3(Integer userNo,Integer courseId);
    List teacherQueryProgress_4(Integer section,
                                     Integer studentCount, Integer courseId, List<UserClass> list);

}