package com.student.service.impl;

import com.student.dao.UserMapper;
import com.student.pojo.User;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl  implements StudentService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUser(User user) {
        return userMapper.getUserByUser(user);
    }


}
