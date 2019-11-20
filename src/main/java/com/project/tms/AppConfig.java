package com.project.tms;

import com.project.tms.di.Element;
import com.project.tms.di.ElementImp;
import com.project.tms.di.Paint;
import com.project.tms.di.PaintImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.project.tms")
public class AppConfig {

    @Bean(name = "class")
    public FistClassForSpring getFistClassForSpring(){
        return new FistClassForSpring();
    }
    @Bean
    public Element getElement(){
        return new ElementImp();
    }
    @Bean
    public Paint getPaint(){
        return new PaintImpl();
    }
}
