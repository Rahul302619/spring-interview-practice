package com.example.springinterviewpractice.scope.prototype.request;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prototype-request")
@AllArgsConstructor
public class PrototypeRequestScopeController {

    private PrototypeScopeBeanPR prototypeScopeBean;
    private PrototypeScopeBeanPR1 prototypeScopeBean1;

    @GetMapping("request")
    public void getRequestScopeBean() {
        var request = prototypeScopeBean.setRequestScopeBeanP();
        var request1 = prototypeScopeBean1.setRequestScopeBeanP();
        System.out.println(request);
        System.out.println(request1);
    }

    @GetMapping("request1")
    public void getRequestScopeBean1() {
        var request = prototypeScopeBean.setRequestScopeBean1();
        var request1 = prototypeScopeBean1.setRequestScopeBeanP();
        System.out.println(request);
        System.out.println(request1);
    }

    @GetMapping("request2")
    public void getRequestScopeBean2() {
        var request = prototypeScopeBean.setRequestScopeBean2();
        var request1 = prototypeScopeBean1.setRequestScopeBeanP();
        System.out.println(request);
        System.out.println(request1);
    }
}
