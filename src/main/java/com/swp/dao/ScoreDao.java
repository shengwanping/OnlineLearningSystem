package com.swp.dao;

import com.swp.entity.Progress;
import com.swp.entity.Score;
import com.swp.entity.Test;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Score)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-24 17:47:21
 */
public interface ScoreDao {

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
     * @return 影响行数
     */
    Integer insert(Score score);


    /**没有数据则增加数据*/
    Integer insertByUser(Progress progress);
    /**
     * 修改观看视频的最长时间
     *
     * @param progress 实例对象
     * @return 影响行数
     */
    Integer insertByMaxTime(Progress progress);
    /**
     * 查询最长时间
     *
     * @param progress 实例对象
     * @return 影响行数
     */
    Integer queryMaxTime(Progress progress);



}