package com.example.springinterviewpractice.scope.singleton.request;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@AllArgsConstructor
public class SingletonScopeBeanR {

    private RequestScopeBean requestScopeBean;

    public RequestScopeBean setRequestScopeBean() {
        return requestScopeBean;
    }

    public RequestScopeBean setRequestScopeBean1() {
        requestScopeBean.setId(1L);
        requestScopeBean.setName("RequestScope");
        return requestScopeBean;
    }

    public RequestScopeBean setRequestScopeBean2() {
        requestScopeBean.setId(2L);
        return requestScopeBean;
    }

}
