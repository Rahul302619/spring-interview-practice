package com.example.springinterviewpractice.scope.prototype.request;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@AllArgsConstructor
public class PrototypeScopeBeanPR {

    private RequestScopeBeanP requestScopeBeanP;

    public RequestScopeBeanP setRequestScopeBeanP() {
        return requestScopeBeanP;
    }

    public RequestScopeBeanP setRequestScopeBean1() {
        requestScopeBeanP.setId(1L);
        requestScopeBeanP.setName("Request Scope");
        return requestScopeBeanP;
    }

    public RequestScopeBeanP setRequestScopeBean2() {
        requestScopeBeanP.setId(2L);
        return requestScopeBeanP;
    }

}
