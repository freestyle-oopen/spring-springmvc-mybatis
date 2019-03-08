import com.ren.qq.mapper.YouTubeDao;
import com.ren.qq.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
          ApplicationContext applicationContextnew =new FileSystemXmlApplicationContext("applicationContext-*.xml");

        YouTubeDao userDao = (YouTubeDao) applicationContextnew.getBean(YouTubeDao.class);

        userDao.addUser(new User("张三","123"));



    }
}
