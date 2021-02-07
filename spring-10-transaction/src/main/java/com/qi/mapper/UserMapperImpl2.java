package com.qi.mapper;

import com.qi.dao.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

    @Override
    public void test(User user) {
        this.addUser(user);
        this.deleteUser(user.getId());
        List<User> users = this.selectUser();
        for (User i:users
             ) {
            System.out.println(i);
        }
    }

}
