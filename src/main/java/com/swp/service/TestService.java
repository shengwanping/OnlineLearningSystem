package com.swp.service;

import com.swp.entity.Test;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * (Test)表服务接口
 *
 * @author makejava
 * @since 2020-11-24 09:56:23
 */
public interface TestService {

    /**
     * 学生查询章节测试
     * */
    List<Test> queryBySection(Test test);

    Integer insertTest( Test test);

}