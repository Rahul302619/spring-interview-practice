package com.example.springinterviewpractice.scope.prototype.singleton;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@AllArgsConstructor
public class PrototypeScopeBeanP {

    private SingletonScopeBeanP singletonScopeBean;

    public SingletonScopeBeanP setSingletonScopeBean() {
        return singletonScopeBean;
    }

    public SingletonScopeBeanP setSingletonScopeBean1() {
        singletonScopeBean.setId(1L);
        singletonScopeBean.setName("SingletonScope");
        return singletonScopeBean;
    }

    public SingletonScopeBeanP setSingletonScopeBean2() {
        singletonScopeBean.setId(2L);
        return singletonScopeBean;
    }

}
