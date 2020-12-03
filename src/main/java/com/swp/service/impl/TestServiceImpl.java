package com.swp.service.impl;

import com.swp.entity.Test;
import com.swp.dao.TestDao;
import com.swp.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Test)表服务实现类
 *
 * @author makejava
 * @since 2020-11-24 09:56:23
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;

    /**
     * 学生查询章节测试
     * */
    @Override
    public List<Test> queryBySection(Test test) {
        return testDao.queryBySection(test);
    }

    @Override
    public Integer insertTest(Test test) {
        return testDao.insertTest(test);
    }
}