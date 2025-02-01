package ru.job4j.di.model.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextByListOfClasses {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        var ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}