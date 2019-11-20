import com.project.tms.db.DataBaseConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class DB {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DataBaseConfig dataBaseConfig = context.getBean("db",DataBaseConfig.class);
        Properties properties = dataBaseConfig.getProperties();
        System.out.println("driverClassName : " + properties.getProperty("driverClassName"));
        System.out.println("url : " + properties.getProperty("url"));
        System.out.println("username : " + properties.getProperty("username"));
        System.out.println("password : " + properties.getProperty("password"));
    }

}
