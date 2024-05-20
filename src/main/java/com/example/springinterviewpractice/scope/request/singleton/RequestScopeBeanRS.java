package com.example.springinterviewpractice.scope.request.singleton;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@AllArgsConstructor
public class RequestScopeBeanRS {

    private SingletonScopeBeanRS requestScopeBeanP;

    public SingletonScopeBeanRS setSingletonScopeBeanRS() {
        return requestScopeBeanP;
    }

    public SingletonScopeBeanRS setSingletonScopeBeanRS1() {
        requestScopeBeanP.setId(1L);
        requestScopeBeanP.setName("Singleton Scope");
        return requestScopeBeanP;
    }

    public SingletonScopeBeanRS setSingletonScopeBeanRS2() {
        requestScopeBeanP.setId(2L);
        return requestScopeBeanP;
    }

}
