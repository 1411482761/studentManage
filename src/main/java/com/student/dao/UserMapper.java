package com.student.dao;


import com.student.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User getUserByUser(User user);


}