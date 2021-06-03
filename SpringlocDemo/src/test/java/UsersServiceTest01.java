import com.tou.demo.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tom
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2021/6/3 14:38
 */
public class UsersServiceTest01 {
    public static void main(String[] args){
        //1. 加载Spring的核心配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2. 获取指定bean对象(多态)
        UsersService usersService = (UsersService)ac.getBean("usersService");
        //3. 调用方法
        usersService.addUsers();
    }
}
