package com.swp.service.impl;

import com.swp.entity.Progress;
import com.swp.dao.ProgressDao;
import com.swp.entity.TeacherClassCourse;
import com.swp.entity.UserClass;
import com.swp.service.ProgressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * (Progress)表服务实现类
 *
 * @author makejava
 * @since 2020-11-25 18:58:15
 */
@Service("progressService")
public class ProgressServiceImpl implements ProgressService {
    @Resource
    private ProgressDao progressDao;

    /**
     * 查看某一学生，一门课程的总学习进度
     */
    @Override
    public Integer queryALLProgress(Progress progress) {
        return progressDao.queryALLProgress(progress);
    }

    /**
     * 根据老师id查询老师所教的班级进度
     * @return
     */
    @Override
    public List  teacherQueryProgress(Integer userNo) {
        ArrayList arrayList= new ArrayList();
        /*老师id -》课程*/
        List<TeacherClassCourse> list = this.progressDao.teacherQueryProgress(userNo);
        for(TeacherClassCourse t: list){
            /*(老师，课程-》章节)*/
            Integer list3 = this.progressDao.teacherQueryProgress_3(userNo,t.getCourseId());
            //System.out.println(list3);
            /*老师id，课程 -》班级*/
            List<TeacherClassCourse> list1=this.progressDao.teacherQueryProgress_1(userNo,t.getCourseId());
            //System.out.println(t.getCourseId());
            for(TeacherClassCourse t1: list1){
                    /*班级->学生*/
                    List<UserClass> list2 = this.progressDao.teacherQueryProgress_2(t1.getClassNo());
                    //System.out.println(t1.getClassNo());
                        List list4 = this.progressDao.teacherQueryProgress_4(list3,list2.size(),t.getCourseId(),list2);
                        //System.out.println(list3);
                        //System.out.println(list2.size());
                        //System.out.println(t.getCourseId());
                        //System.out.println(list2);
                        //System.out.println(list4);
                        if(list4.get(0) ==null){//没有数据时，即没有学生学习时
                            arrayList.add(t1.getClassNo());
                        }else{
                            arrayList.add(list4);
                        }
                }
        }
        System.out.println(arrayList);
        return arrayList;
    }
}