package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TeacherClassCourse)实体类
 *
 * @author makejava
 * @since 2020-11-11 19:11:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherClassCourse implements Serializable {
    private static final long serialVersionUID = -33906756933577905L;
    
    private Integer id;
    
    private Integer userNo;
    
    private Integer classNo;
    
    private Integer courseId;




}