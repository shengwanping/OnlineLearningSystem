package com.swp.service.impl;

import com.swp.entity.Answer;
import com.swp.dao.AnswerDao;
import com.swp.service.AnswerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Answer)表服务实现类
 *
 * @author makejava
 * @since 2020-11-24 14:19:49
 */
@Service("answerService")
@Transactional //事务
public class AnswerServiceImpl implements AnswerService {
    @Resource
    private AnswerDao answerDao;

    /**
     * 新增数据
     *
     * @param answers 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(List<Answer> answers) {
        return this.answerDao.insert(answers);
    }

    /**
     * 查询学生该章节是否已有答案
     */
    @Override
    public Integer selectCount(Answer answers) {
        return this.answerDao.selectCount(answers);
    }


}