package com.abdtouirsi.presentation;

import com.abdtouirsi.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.abdtouirsi.metier", "com.abdtouirsi.dao");
        IMetier metier = (IMetier) applicationContext.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
