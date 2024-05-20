package com.example.springinterviewpractice.scope.singleton.request;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@AllArgsConstructor
public class SingletonScopeBeanR1 {

    private RequestScopeBean requestScopeBean;

    public RequestScopeBean setRequestScopeBean() {
        return requestScopeBean;
    }

}
