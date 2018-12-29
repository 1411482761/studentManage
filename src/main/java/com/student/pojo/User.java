package com.student.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private String sex;

    private String idCard;

    private String address;

    private String phone1;

    private String phone2;

    private Integer userRole;

    private Integer state;

    private String className;

    private int teacherId;

    public final static Integer USER_ROLE_ADMIN=1;
    public final static Integer USER_ROLE_TEACHER=2;
    public final static Integer USER_ROLE_STUDENT=3;

    public final  static Integer USER_STATE_NORMAL=1;
    public final  static Integer USER_STATE_DROP_OUT=2;
    public final  static Integer USER_STATE_GRADUATE=3;



}