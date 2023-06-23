import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        Cat cat2 = applicationContext.getBean("catBean", Cat.class);
        System.out.println(cat1 == cat2);
        System.out.println(bean == bean1);
    }
}