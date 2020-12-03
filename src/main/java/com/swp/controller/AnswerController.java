package com.swp.controller;

import com.swp.entity.Answer;
import com.swp.service.AnswerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Answer)表控制层
 *
 * @author makejava
 * @since 2020-11-24 14:19:49
 */
@RestController
@RequestMapping("answer")
public class AnswerController {
    /**
     * 服务对象
     */
    @Resource
    private AnswerService answerService;

    /**
     * 学生提交测试
     *
     * @param answers 实例对象
     * @return 单条数据
     */
    @PostMapping("insert")
    public Integer insert(@RequestBody(required = false) List<Answer> answers) {
        System.out.println(answers);
        return this.answerService.insert(answers);
    }

    /**
     * 查询学生该章节是否已有答案
     */
    @PostMapping("selectCount")
    public Integer selectCount(@RequestBody(required = false)Answer answers) {
        System.out.println(answers);
        return this.answerService.selectCount(answers);
    }

}