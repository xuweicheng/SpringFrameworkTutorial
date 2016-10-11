/**
 * Created by Weicheng on 10/10/2016.
 */
package com.pluralsight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//these two annotations do the same thing as web.xml and servlet-config.xml
@Configuration //this create same thing as web.xml find a servlet
@EnableWebMvc //spring knows how to create container and load
@ComponentScan(basePackages="com.pluralsight")
public class WebConfig {

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");

        return resolver;
    }
}
