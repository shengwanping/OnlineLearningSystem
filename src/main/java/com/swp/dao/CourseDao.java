package com.swp.dao;

import com.swp.entity.User;

import java.util.List;

public interface CourseDao {

    List<User> queryAll(Integer user_no);

}
