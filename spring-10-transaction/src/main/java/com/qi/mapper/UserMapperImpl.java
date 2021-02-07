//package com.qi.mapper;
//
//import com.qi.dao.User;
//import org.mybatis.spring.SqlSessionTemplate;
//
//import java.util.List;
//
//public class UserMapperImpl implements UserMapper{
//    private SqlSessionTemplate SqlSession;
//
//
//    public List<User> selectUser() {
//        UserMapper mapper = SqlSession.getMapper(UserMapper.class);
//        return mapper.selectUser();
//    }
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.SqlSession = sqlSession;
//    }
//}
