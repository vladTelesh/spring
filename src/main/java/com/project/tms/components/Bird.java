package com.project.tms.components;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Animal {
    public void say(){
        System.out.println("chirik");
    }
}
