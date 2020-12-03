package com.swp.dao;

import com.swp.entity.PublishCourse;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PublishCourse)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-13 06:13:36
 */
public interface PublishCourseDao {


    /**
     * 新增数据
     *
     * @param publishCourse 实例对象
     * @return 影响行数
     */
    Integer insert(List<PublishCourse> publishCourse);

    /**
     * 查看老师的所有课程
     *
     * @param userNo 实例对象
     * @return 实例对象PublishCourse
     */
    List<PublishCourse> selectAll(Integer userNo,String courseName) ;

    /**
     * 管理员查看所有课程(这里的@Param("courseName")是为了接收if语句判断的string)
     *  Mybatis默认采用OGNL解析参数，所以会自动采用对象树的形式取 string.xxx 值，如果没在在方法中定义,则会抛异常报错
     * @param courseName 实例对象
     * @return 实例对象PublishCourse
     */
    List<PublishCourse>  selectAll2(@Param("courseName") String courseName);
    /**
     * 删除选中课程
     *
     * @param publishCourse 实例对象
     * @return 单条数据
     */
    Integer deleteOne(PublishCourse publishCourse);

    /**
     * 通过学号,课程号查询一门课程
     *
     * @param userNo 主键
     * @return 集合
     */
    List<PublishCourse> querySingleCourse(Integer userNo, Integer courseId);

    /**
     * 管理员审核一门课程
     *
     * @param userNo 主键
     * @return 集合
     */
    List<PublishCourse> querySingleCourseAdmin(Integer userNo, Integer courseId);

    /**
     * 管理员修改课程状态
     *
     */
    Integer updateCourseStatus( Integer userNo, Integer courseId,Integer status);


}