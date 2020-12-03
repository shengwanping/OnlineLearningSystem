package com.swp.controller;

import com.swp.entity.Progress;
import com.swp.entity.Score;
import com.swp.entity.Test;
import com.swp.service.ScoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表控制层
 *
 * @author makejava
 * @since 2020-11-24 17:47:21
 */
@RestController
@RequestMapping("score")
public class ScoreController {
    /**
     * 服务对象
     */
    @Resource
    private ScoreService scoreService;

    /**
     * 通过主键查询单条数据
     *
     * @param test 主键
     * @return 单条数据
     */
    @PostMapping("queryScore")
    public List<Test> queryScore(@RequestBody(required = false) Test test) {
        return this.scoreService.queryScore(test);
    }

    /**
     * 插入成绩
     *
     * @param score
     * @return 单条数据
     */
    @PostMapping("insert")
    public Integer insert(@RequestBody(required = false) Score score) {
        return this.scoreService.insert(score);
    }

    /**
     * 修改观看视频的最长时间
     *
     * @param progress 实例对象
     * @return 影响行数
     */
    @PostMapping("insertByMaxTime")
    Integer insertByMaxTime(@RequestBody(required = false) Progress progress) {

        return this.scoreService.insertByMaxTime(progress);
    }

}