import com.qi.pojo.Hello;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    @Test
    void test()
    {
        // 获取spring的上下文对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                "Beans.xml");
        // 控制反转
        Hello hello = (Hello) context.getBean("abc");
        System.out.println(hello);

    }
}
