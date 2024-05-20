package com.example.springinterviewpractice.scope.request.prototype;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@AllArgsConstructor
public class RequestScopeBeanRP1 {

    private PrototypeScopeBeanRP prototypeScopeBeanRP;

    public PrototypeScopeBeanRP setPrototypeScopeBeanRP() {
        return prototypeScopeBeanRP;
    }

    public PrototypeScopeBeanRP setRequestScopeBean1() {
        prototypeScopeBeanRP.setId(3L);
        prototypeScopeBeanRP.setName("Request Scope New");
        return prototypeScopeBeanRP;
    }

    public PrototypeScopeBeanRP setRequestScopeBean2() {
        prototypeScopeBeanRP.setId(4L);
        return prototypeScopeBeanRP;
    }

}
