import com.qi.dao.UserMapper;
import com.qi.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlGenertor = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
        SqlSession sqlSession = sqlGenertor.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getall();
        for (User user:users
             ) {
            System.out.println(user);
        }
    }
}