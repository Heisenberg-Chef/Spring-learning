import com.qi.pojo.human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        human human = context.getBean("human",human.class);
        human.getDog().bark();
        human.getCat().bark();
    }
}
