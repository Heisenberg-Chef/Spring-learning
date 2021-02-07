import com.qi.dao.User;
import com.qi.mapper.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;

import java.util.List;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
        new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapperImpl2 = (UserMapper) classPathXmlApplicationContext.getBean(UserMapper.class);

        User xiaowang = new User(5,"HHH","008778");

        userMapperImpl2.test(xiaowang);
    }
}
