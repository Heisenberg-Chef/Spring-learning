import com.qi.service.UserService;
import com.qi.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 代理的是一个接口
        UserService userservice = (UserService) classPathXmlApplicationContext.getBean("userservice");

        userservice.add();
    }

}
