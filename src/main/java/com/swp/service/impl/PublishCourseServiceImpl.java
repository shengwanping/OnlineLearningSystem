package com.swp.service.impl;

import com.swp.entity.PublishCourse;
import com.swp.dao.PublishCourseDao;
import com.swp.service.PublishCourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PublishCourse)表服务实现类
 *
 * @author makejava
 * @since 2020-11-13 06:13:38
 */
@Service("publishCourseService")
@Transactional //事务
public class PublishCourseServiceImpl implements PublishCourseService {
    @Resource
    private PublishCourseDao publishCourseDao;


    /**
     * 新增数据
     *
     * @param publishCourse 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(List<PublishCourse> publishCourse) {
        return this.publishCourseDao.insert(publishCourse);
    }

    /**
     * 查看老师的所有课程
     *
     * @param userNo 实例对象
     * @return 实例对象PublishCourse
     */
    @Override
    public List<PublishCourse> selectAll(Integer userNo,String courseName) {
        return this.publishCourseDao.selectAll(userNo,courseName);
    }
    /**
     * 管理员查看所有课程
     *
     * @param courseName 实例对象
     * @return 实例对象PublishCourse
     */
    @Override
    public List<PublishCourse> selectAll2(String courseName) {
        return this.publishCourseDao.selectAll2(courseName);
    }

    /**
     * 删除选中课程
     *
     * @param publishCourse 实例对象
     * @return 单条数据
     */
    @Override
    public Integer deleteOne(PublishCourse publishCourse) {
        return this.publishCourseDao.deleteOne(publishCourse);
    }

    /**
     * 通过学号,课程号查询一门课程
     *
     * @param userNo 主键
     * @return 集合
     */
    @Override
    public List<PublishCourse> querySingleCourse(Integer userNo, Integer courseId){
        if(userNo>1235000){ //区分管理员，学生，教师
            return this.publishCourseDao.querySingleCourse(userNo,courseId);//学生
        }else {
            return this.publishCourseDao.querySingleCourseAdmin(userNo,courseId);//管理员
        }
    };

    /**
     * 管理员修改课程状态
     *
     */
    @Override
    public Integer updateCourseStatus(Integer userNo,Integer courseId,Integer status){
        return this.publishCourseDao.updateCourseStatus(userNo,courseId,status);
    };

}