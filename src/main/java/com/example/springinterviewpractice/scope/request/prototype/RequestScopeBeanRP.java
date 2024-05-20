package com.example.springinterviewpractice.scope.request.prototype;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@AllArgsConstructor
public class RequestScopeBeanRP {

    private PrototypeScopeBeanRP prototypeScopeBeanRP;

    public PrototypeScopeBeanRP setPrototypeScopeBeanRP() {
        return prototypeScopeBeanRP;
    }

    public PrototypeScopeBeanRP setRequestScopeBean1() {
        prototypeScopeBeanRP.setId(1L);
        prototypeScopeBeanRP.setName("Request Scope");
        return prototypeScopeBeanRP;
    }

    public PrototypeScopeBeanRP setRequestScopeBean2() {
        prototypeScopeBeanRP.setId(2L);
        return prototypeScopeBeanRP;
    }

}
