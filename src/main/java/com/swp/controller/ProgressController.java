package com.swp.controller;

import com.swp.entity.Progress;
import com.swp.service.ProgressService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Progress)表控制层
 *
 * @author makejava
 * @since 2020-11-25 18:58:15
 */
@RestController
@RequestMapping("progress")
public class ProgressController {
    /**
     * 服务对象
     */
    @Resource
    private ProgressService progressService;

    /**
     * 查看某一学生，一门课程的总学习进度
     */
    @PostMapping("queryALLProgress")
    public Integer queryALLProgress(@RequestBody(required = false) Progress progress) {
        return progressService.queryALLProgress(progress);
    }

    /**
     * 根据老师id查询老师所教的班级进度
     */
    @GetMapping("teacherQueryProgress")
    public List teacherQueryProgress(Integer userNo) {
        return progressService.teacherQueryProgress(userNo);
    }

}