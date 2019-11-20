package com.project.tms.components;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    public void say(){
        System.out.println("miay");
    }
}
