import com.qi.dao.StudentMapper;
import com.qi.pojo.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
        SqlSession sql = factory.openSession();
        // 通过接口调用
        StudentMapper mapper = sql.getMapper(StudentMapper.class);
        List<student> stuList = mapper.getinfo();
        for (student stu:stuList
             ) {
            System.out.println(stu);
        }
    }
}
