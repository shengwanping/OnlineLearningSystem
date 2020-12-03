package com.swp.dao;

import com.swp.entity.Answer;


import java.util.List;

/**
 * (Answer)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-24 14:19:49
 */
public interface AnswerDao {


    /**
     * 新增数据
     *
     * @param answers 实例对象
     * @return 影响行数
     */
    Integer insert( List<Answer> answers);

    /**
     * 查询学生该章节是否已有答案
     */
    Integer selectCount( Answer answers);


}