import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by WeichengXu on 10/1/2016.
 */
public class Application {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        CustomerService service = new CustomerServiceImpl();

        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service);
        CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service2);
        // customerService is in scope singleton, the two service addresses we printout are the same
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
