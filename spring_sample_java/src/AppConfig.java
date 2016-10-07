import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by WeichengXu on 10/2/2016.
 */
@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties") //com.pluralsight.model
public class AppConfig {

    public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceHolderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    //    Setter Injection
//    @Bean(name="customerService")
//    public CustomerService getCustomerService(){
//        CustomerService customerService = new CustomerServiceImpl();
//        customerService.setCustomerRepository(getCustomerRepository());
//        return customerService;
//    }

//    @Bean(name="customerRepository")
//    public CustomerRepository getCustomerRepository(){
//        return new HibernateCustomerRepositoryImpl();
//    }

    // Construtor Injection
//    @Bean(name="customerService")
//    public CustomerService getCustomerService(){
//        CustomerService customerService = new CustomerServiceImpl(getCustomerRepository());
//        return customerService;
//    }

//    @Bean(name="customerService")
//    public CustomerService getCustomerService(){
//        CustomerService customerService = new CustomerServiceImpl();
//        return customerService;
//    }
}
