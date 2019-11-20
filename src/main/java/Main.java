import com.project.tms.AppConfig;
import com.project.tms.FactoryMethod;
import com.project.tms.FistClassForSpring;
import com.project.tms.components.Animal;
import com.project.tms.components.Bird;
import com.project.tms.components.Cat;
import com.project.tms.components.Dog;
import com.project.tms.di.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FistClassForSpring fistClassForSpring = context.getBean("class", FistClassForSpring.class);
        fistClassForSpring.say();

        Animal cat = context.getBean(Cat.class);
        cat.say();
        Animal dog = context.getBean(Dog.class);
        dog.say();
        Animal bird = context.getBean(Bird.class);
        bird.say();

        FactoryMethod factoryMethod = context1.getBean("factory",FactoryMethod.class);
        factoryMethod.doSomething();

        Company company = context.getBean(Company.class);
        company.showElementMethodRealization();
        company.showPaintMethodRealization();
    }
}
