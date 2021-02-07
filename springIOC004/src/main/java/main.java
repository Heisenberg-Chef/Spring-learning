import com.qi.pojo.User;
import com.qi.pojo.ptest;
import com.qi.pojo.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
//    普通注入方式
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        student stu = (student)context.getBean("student");
        System.out.println(stu);
    }
//  p注入方式
    @Test
    public void func()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("PBeans.xml");
        User p = (User)context.getBean(User.class);
        System.out.println(p);
    }
//  c注入方式
    @Test
    public void func_c()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("CBeans.xml");
        User c = context.getBean("User",User.class);
        System.out.println(c);
    }

}
