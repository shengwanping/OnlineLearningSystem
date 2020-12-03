package com.swp.service.impl;

import com.swp.entity.Progress;
import com.swp.entity.Score;
import com.swp.dao.ScoreDao;
import com.swp.entity.Test;
import com.swp.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表服务实现类
 *
 * @author makejava
 * @since 2020-11-24 17:47:21
 */
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreDao scoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param test 主键
     * @return 实例对象
     */
    @Override
    public List<Test> queryScore(Test test) {

        return this.scoreDao.queryScore(test);
    }

    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(Score score) {

        return this.scoreDao.insert(score);
    }

    /**
     * 修改观看视频的最长时间(如果时间小于保存的时间则不修改)
     *
     * @param progress 实例对象
     * @return 影响行数
     */
    @Override
    public Integer insertByMaxTime(Progress progress){
        //System.out.println(score);
        Integer a=this.scoreDao.queryMaxTime(progress);

        if(a!=null && a<progress.getMaxTime()){ //大于保存时间则insert
            this.scoreDao.insertByMaxTime(progress);
            return -1;
        }else if(a==null){ //第一次进来创建一行数据
            this.scoreDao.insertByUser(progress);
            return 0;
        }else{ //小于保存时间返回
            return a;
        }
    }

}