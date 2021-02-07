package com.qi.mapper;

import com.qi.dao.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    public int addUser(User user);

    public int deleteUser(@Param("id") int id);

    public void test(User user);
}
