import com.qi.dao.User;
import com.qi.mapper.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = classPathXmlApplicationContext.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.selectUser();
        for (User user:users
        ) {
            System.out.println(user);
        }
        System.out.println("Second method -----------------------------------------");
        UserMapper userMapper2 = classPathXmlApplicationContext.getBean("userMapper2", UserMapper.class);
        List<User> users1 = userMapper2.selectUser();
        for (User user:users1
        ) {
            System.out.println(user);
        }
    }
}
