package com.itheima.web;

import com.github.pagehelper.PageInfo;
import com.itheima.pojo.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;

    @ResponseBody
    @GetMapping("/findUsers")
    public PageInfo<User> findUsers(
            @RequestParam(defaultValue = "0") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize
    ){
        return iUserService.findByPage(pageNum, pageSize);
    }
}
