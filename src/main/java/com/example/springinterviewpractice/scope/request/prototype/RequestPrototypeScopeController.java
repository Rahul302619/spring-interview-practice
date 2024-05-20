package com.example.springinterviewpractice.scope.request.prototype;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("request-prototype")
@AllArgsConstructor
public class RequestPrototypeScopeController {

    private RequestScopeBeanRP requestScopeBeanRP;
    private RequestScopeBeanRP1 requestScopeBeanRP1;

    /*
    * Since RequestScopeBean object always get initiated on each and every request
    * that's why for each request new prototype object get injected into RequestScopeBean
    * */
    @GetMapping("prototype")
    public List<PrototypeScopeBeanRP> getRequestScopeBeanRP() {
        return List.of(
                requestScopeBeanRP.setPrototypeScopeBeanRP(),
                requestScopeBeanRP1.setPrototypeScopeBeanRP()
        );
    }

    @GetMapping("prototype1")
    public List<PrototypeScopeBeanRP> getRequestScopeBeanRP1() {
        return List.of(
                requestScopeBeanRP.setRequestScopeBean1(),
                requestScopeBeanRP1.setRequestScopeBean1()
        );
    }

    @GetMapping("prototype2")
    public List<PrototypeScopeBeanRP> getRequestScopeBeanRP2() {
        return List.of(
                requestScopeBeanRP.setRequestScopeBean2(),
                requestScopeBeanRP1.setRequestScopeBean2()
        );
    }
}
