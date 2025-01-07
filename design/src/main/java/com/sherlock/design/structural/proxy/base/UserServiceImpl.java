package com.sherlock.design.structural.proxy.base;

public class UserServiceImpl implements UserService{

    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userMapper = new UserMapperImpl();
        userMapper.saveUser(user);
    }
}
