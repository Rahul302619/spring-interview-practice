package com.example.springinterviewpractice.scope.singleton.request;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("singleton-request")
@AllArgsConstructor
public class SingletonRequestScopeController {

    private SingletonScopeBeanR singletonScopeBean;
    private SingletonScopeBeanR1 singletonScopeBean1;

    /*
    * Unlike Prototype scope bean in request scope no need to use look up method it will
    * inject new request object to the singleton object on each and every request.
    * */
    @GetMapping("request")
    public void getRequestScopeBean() {
        var request = singletonScopeBean.setRequestScopeBean();
        var request1 = singletonScopeBean1.setRequestScopeBean();
        System.out.println(request);
        System.out.println(request1);
    }

    @GetMapping("request1")
    public void getRequestScopeBean1() {
        var request = singletonScopeBean.setRequestScopeBean1();
        var request1 = singletonScopeBean1.setRequestScopeBean();
        System.out.println(request);
        System.out.println(request1);
    }

    @GetMapping("request2")
    public void getRequestScopeBean2() {
        var request = singletonScopeBean.setRequestScopeBean2();
        var request1 = singletonScopeBean1.setRequestScopeBean();
        System.out.println(request);
        System.out.println(request1);
    }
}
