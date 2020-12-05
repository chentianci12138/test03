import com.it.service.Service;
import com.tc.pojo.Bean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        Service itemsService = (Service)applicationContext.getBean("serviceImpl");
        Bean1 items = new Bean1();
        items.setName("测试测试");
        itemsService.add(items);
    }
}
