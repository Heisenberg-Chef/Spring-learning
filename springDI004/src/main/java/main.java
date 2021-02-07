import com.qi.Dao.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        student st = (student)context.getBean("student");
        student st2 = (student)context.getBean("student");
        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st);
        System.out.println(st2);
    }
}
