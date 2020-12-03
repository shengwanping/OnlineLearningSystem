package com.swp.service;

import com.swp.entity.Answer;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * (Answer)表服务接口
 *
 * @author makejava
 * @since 2020-11-24 14:19:49
 */
public interface AnswerService {

    /**
     * 新增数据
     *
     * @param answers 实例对象
     * @return 实例对象
     */
   Integer insert(List<Answer> answers);

    /**
     * 查询学生该章节是否已有答案
     */
    Integer selectCount( Answer answers);



}