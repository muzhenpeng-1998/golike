package com.project.service.impl;

import com.project.mapper.UsersMapper;
import com.project.pojo.Users;
import com.project.service.UserService;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nameM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users getUserInfo(int id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public Users saveUsers() {
        return null;
    }

    @Override
    public Users updateUsers(int id) {
        return null;
    }

    @Override
    public Users deleteUsers(int id) {
        return null;
    }
}
