package com.example.springinterviewpractice.scope.request.singleton;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("request-singleton")
@AllArgsConstructor
public class RequestSingletonScopeController {

    private RequestScopeBeanRS requestScopeBeanRS;
    private RequestScopeBeanRS1 requestScopeBeanRS1;

    @GetMapping("singleton")
    public List<SingletonScopeBeanRS> getSingletonScopeBean() {
        return List.of(
                requestScopeBeanRS.setSingletonScopeBeanRS(),
                requestScopeBeanRS1.setSingletonScopeBeanRS()
        );
    }

    @GetMapping("singleton1")
    public List<SingletonScopeBeanRS> getSingletonScopeBean1() {
        return List.of(
                requestScopeBeanRS.setSingletonScopeBeanRS1(),
                requestScopeBeanRS1.setSingletonScopeBeanRS1()
        );
    }

    @GetMapping("singleton2")
    public List<SingletonScopeBeanRS> getSingletonScopeBean2() {
        return List.of(
                requestScopeBeanRS.setSingletonScopeBeanRS2(),
                requestScopeBeanRS1.setSingletonScopeBeanRS2()
        );
    }
}
