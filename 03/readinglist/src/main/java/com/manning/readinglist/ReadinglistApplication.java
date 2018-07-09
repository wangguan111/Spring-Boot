package com.manning.readinglist;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;

@SpringBootApplication
public class ReadinglistApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args)
    {
        SpringApplication.run(ReadinglistApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController("/login").setViewName("login");
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers)
    {
        argumentResolvers.add(new ReaderHandlerMethodArgumentResolver());
    }
}
