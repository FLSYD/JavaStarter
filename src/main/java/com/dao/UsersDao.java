package com.dao;


import java.util.List;

import com.entity.Users;

public interface UsersDao {

    public Users get_id(int id);
    public List<Users> get_all();
    public int add(Users user);
    public int delete(int id);
    public int update(Users user);
}
