package com.project.tms;

public class FactoryMethod {
    private static FactoryMethod factoryMethod;
    private FactoryMethod(){
        System.out.println("Inside FactoryMethod private constructor. ");
    }

    public static FactoryMethod getInstance(){
        if(factoryMethod == null){
            factoryMethod = new FactoryMethod();
        }
        return factoryMethod;
    }

    public void doSomething() {
        System.out.println("Inside doSomething method");
    }
}
