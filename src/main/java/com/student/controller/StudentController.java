package com.student.controller;

import com.student.pojo.User;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/user/login.do")
    public String login(Map map, User user,HttpSession session){
        user.setUserRole(User.USER_ROLE_ADMIN);
        User user1=studentService.getUserByUser(user);
        if(user1!=null){
            session.setAttribute("session_user",user1);
            map.put("user",user1);
            return "success";
        }else {
            map.put("user",user);
            map.put("error","用户名或密码不正确");
            return "index";
        }
    }

}
