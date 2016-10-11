import com.pluralsight.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Weicheng on 10/10/2016.
 */
public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        WebApplicationContext context = getContext();

        servletContext.addListener(new ContextLoaderListener(context));

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));

        dispatcher.setLoadOnStartup(1);

        dispatcher.addMapping("*.html");
    }

    public WebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

//        context.setConfigLocation("com.pluralsight.WebConfig");
// for a more recent version of spring MVC, do the following
        context.register(WebConfig.class);
        //this is doing the web.xml config job by specifying contextConfigLocation param-name and value

        return context;
    }
}
