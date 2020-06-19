//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
//public class AppTest {
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Test
//    public void mainTest() {
//        HelloWorld tree =
//                applicationContext.getBean(HelloWorld.class);
//        HelloWorld leaf =
//                applicationContext.getBean(HelloWorld.class);
//
//        Cat one = applicationContext.getBean(Cat.class);
//        Cat two = applicationContext.getBean(Cat.class);
//
//        Assert.assertNotSame(one, two);
//        Assert.assertSame("Тест провален, не корректная настройка бина Cat", tree, leaf);
//        Assert.assertNotSame("Тест провален, не корректная настройка бина HelloWorld", one, two);
//    }
//}
