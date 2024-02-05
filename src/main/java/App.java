import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld helloWorld2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(helloWorld1.getMessage());
        System.out.print(helloWorld1.equals(helloWorld2) + "\n");

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(cat1.getMessage());
        System.out.println(cat1.equals(cat2));
    }
}