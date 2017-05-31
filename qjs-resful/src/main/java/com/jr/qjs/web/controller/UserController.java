package com.jr.qjs.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.jr.qjs.entity.User;
import com.jr.qjs.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2017-05-25
 */
@RestController
@RequestMapping("/users")
@Api("UserController相关api")//控制器类注解
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户
     */
    @GetMapping("/{id}.auth")
    @ApiOperation(value = "新聞詳情", httpMethod = "GET", notes = "新聞詳情")
    public AbstractBean newsContent(@PathVariable Integer id){
        userService.selectById(id);

    }

    /**
     * 分页 PAGE
     */
    @GetMapping("/userPageList")
    public Page<User> userPageList() {
        return userService.selectPage(new Page<User>(0, 3));
    }

    @ApiOperation(value = "plus新增用户", notes = "第一个测试API")
    @RequestMapping(value = "/user",method= RequestMethod.POST)
    public Object addUser(){
        User user = new User("蔡锐", 35);
        JSONObject result = new JSONObject();
        result.put("result", userService.insert(user));
        return result;
    }


}
