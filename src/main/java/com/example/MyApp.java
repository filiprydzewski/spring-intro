package com.example;
import configuration.AppConfiguration;
import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyApp {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        MessageService messageService =context.getBean(RandomTextMessageService.class);
        MessageService randomMessageService = context.getBean(MessageService.class);
        System.out.println(messageService.hashCode());
        System.out.println(randomMessageService.hashCode());
        System.out.println(messageService.getMessage());
        System.out.println(randomMessageService.getMessage());

    }
}
