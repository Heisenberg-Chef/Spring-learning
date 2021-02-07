import com.qi.Dao.UserDaoImpl;
import com.qi.Service.UserSerivce;
import com.qi.Service.UserServiceImpl;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
        // 三层
        UserSerivce userserivce = new UserServiceImpl();
        // 最后输出的是DAO层的代码.
        userserivce.getUser();
    }

    @Test
    void test1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserSerivce service = (UserSerivce)context.getBean("lalala");
        service.getUser();
    }
}
