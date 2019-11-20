package com.project.tms.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class Company {
    private Element element;
    private Paint paint;
    // Constructor based DI
    @Autowired //@Component annotation indicates that an annotated class is a "component"
    public Company(Element element) {
        this.element = element;
    }

    @Autowired
    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public void showElementMethodRealization(){
        element.doSomeThing();
    }
    public void showPaintMethodRealization(){
        paint.circle();
    }
}
