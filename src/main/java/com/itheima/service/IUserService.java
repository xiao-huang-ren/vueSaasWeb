package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.pojo.User;

public interface IUserService {
    PageInfo<User> findByPage(Integer pageNum, Integer pageSize);
}
