package com.project.service;

import com.project.pojo.Users;

/**
 * @author nameM
 */
public interface UserService {

    public Users getUserInfo(int id);

    public Users saveUsers();

    public Users updateUsers(int id);

    public Users deleteUsers(int id);
}
