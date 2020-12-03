package com.swp.dao;

import com.swp.entity.Test;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Test)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-24 09:56:23
 */
public interface TestDao {

    /**
     * 学生查询章节测试
     * */
    List<Test> queryBySection(Test test);

    Integer insertTest( Test test);
}
