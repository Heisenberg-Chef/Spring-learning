import com.qi.config.Configration;
import com.qi.pojo.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.hashCode());
        System.out.println(user);
    }

    @Test
    public void testConfig()
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Configration.class);
        User getUser = (User)annotationConfigApplicationContext.getBean("getUser");
        System.out.println(getUser);

        Object getUser2 = annotationConfigApplicationContext.getBean("getUser2");
        System.out.println(getUser2);
    }
}
