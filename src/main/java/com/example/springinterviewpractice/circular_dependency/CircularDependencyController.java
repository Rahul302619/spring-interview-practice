package com.example.springinterviewpractice.circular_dependency;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("circular-dependency")
public class CircularDependencyController {

    private BeanA beanA;
    private BeanB beanB;

    @GetMapping
    public void test() {
        beanA.callBeanB();
        beanB.callBeanA();
    }
}
