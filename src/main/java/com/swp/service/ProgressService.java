package com.swp.service;

import com.swp.entity.Progress;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * (Progress)表服务接口
 *
 * @author makejava
 * @since 2020-11-25 18:58:15
 */
public interface ProgressService {

    /**
     * 查看某一学生，一门课程的总学习进度
     */
    Integer queryALLProgress(Progress progress);

    /**
     * 根据老师id查询老师所教的班级进度
     */
    List teacherQueryProgress(Integer userNo);

}