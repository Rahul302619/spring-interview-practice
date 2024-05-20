package com.example.springinterviewpractice.scope.request.singleton;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@AllArgsConstructor
public class RequestScopeBeanRS1 {

    private SingletonScopeBeanRS requestScopeBeanP;

    public SingletonScopeBeanRS setSingletonScopeBeanRS() {
        return requestScopeBeanP;
    }

    public SingletonScopeBeanRS setSingletonScopeBeanRS1() {
        requestScopeBeanP.setId(3L);
        requestScopeBeanP.setName("Singleton Scope New");
        return requestScopeBeanP;
    }

    public SingletonScopeBeanRS setSingletonScopeBeanRS2() {
        requestScopeBeanP.setId(4L);
        return requestScopeBeanP;
    }

}
