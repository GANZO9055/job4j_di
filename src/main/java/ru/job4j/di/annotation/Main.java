package ru.job4j.di.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.job4j.di.annotation");
        Man man = context.getBean(Man.class);
        man.print();
    }
}
