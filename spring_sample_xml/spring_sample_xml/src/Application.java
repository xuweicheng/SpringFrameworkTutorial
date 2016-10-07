import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pluralsight.service.CustomerService;

/**
 * Created by WeichengXu on 10/1/2016.
 */
public class Application {
    public static void main(String[] args) {
//        CustomerService service = new CustomerServiceImpl();

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service);
        CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service2);
        // customerService is in scope singleton, the two service addresses we printout are the same
        System.out.println(service.findAll().get(0).getFirstName());


    }
}
