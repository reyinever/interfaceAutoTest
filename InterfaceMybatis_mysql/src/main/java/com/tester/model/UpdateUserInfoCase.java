package com.tester.model;

import lombok.Data;

@Data
public class UpdateUserInfoCase {
    private int id;
    private int userId;
    private String username;
    private int age;
    private String sex;
    private String permission;
    private String isDelete;
    private String expected;
}
