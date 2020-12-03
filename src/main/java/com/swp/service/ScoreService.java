package com.swp.service;

import com.swp.entity.Progress;
import com.swp.entity.Score;
import com.swp.entity.Test;

import java.util.List;

/**
 * (Score)表服务接口
 *
 * @author makejava
 * @since 2020-11-24 17:47:21
 */
public interface ScoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param test 主键
     * @return 实例对象
     */
    List<Test> queryScore(Test test);



    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Integer insert(Score score);

    /**
     * 修改观看视频的最长时间
     *
     * @param progress 实例对象
     * @return 影响行数
     */
    Integer insertByMaxTime(Progress progress);



}