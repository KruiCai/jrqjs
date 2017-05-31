package com.jr.qjs.service.impl;

import com.jr.qjs.entity.User;
import com.jr.qjs.mapper.UserMapper;
import com.jr.qjs.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2017-05-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
