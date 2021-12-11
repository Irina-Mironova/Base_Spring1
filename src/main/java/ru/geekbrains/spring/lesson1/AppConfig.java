package ru.geekbrains.spring.lesson1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.geekbrains.spring.lesson1")
public class AppConfig {
    @Bean(name = "actions")
    public List<Actions> actions(){
        return Arrays.asList(new Archive(), new Schedule(), new Way());
    }

    @Bean(name = "registration")
    public Registration registration(List<Actions> actions){
        Registration registration = new Registration();
        registration.setActions(actions);
        return registration;
    }

}
