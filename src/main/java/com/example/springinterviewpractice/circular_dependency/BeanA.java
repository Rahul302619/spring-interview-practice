package com.example.springinterviewpractice.circular_dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    private final BeanB beanB;

    /*
    * To avoid circular dependency we can do below step-
    * 1) Use Lazy for one of the component dependency injection.
    * 2) Move the common logic to another class and remove the circular dependency for one
    * of the component.
    * 3)
    * */
    public BeanA(@Lazy BeanB beanB) {
        this.beanB = beanB;
    }

    public void callBeanB() {
        beanB.printHello();
    }

    public void printHello() {
        System.out.println("Hello From Bean A");
    }
}
