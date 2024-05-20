package com.example.springinterviewpractice.circular_dependency;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private final BeanA beanA;

    public BeanB(BeanA beanA) {
        this.beanA = beanA;
    }

    public void callBeanA() {
        beanA.printHello();
    }

    public void printHello() {
        System.out.println("Hello From Bean B");
    }
}
