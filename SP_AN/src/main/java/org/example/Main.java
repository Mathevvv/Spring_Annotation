package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // Получаем бин Car
        //Car car = context.getBean("car", Car.class);
        Engine eng = context.getBean("engine", Engine.class);
        System.out.println(eng.getEngineMark());

        context.close();
    }
}
