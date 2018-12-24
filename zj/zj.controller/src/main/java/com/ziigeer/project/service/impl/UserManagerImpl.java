package com.ziigeer.project.service.impl;


import com.ziigeer.project.service.UserManager;

public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String userName) {
        System.out.println("添加用户成功!用户为：" + userName);

    }

}
