package com.example.springinterviewpractice.scope.prototype.singleton;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@AllArgsConstructor
public class PrototypeScopeBeanP1 {

    private SingletonScopeBeanP singletonScopeBean;

    public SingletonScopeBeanP setSingletonScopeBean() {
        return singletonScopeBean;
    }

    public SingletonScopeBeanP setSingletonScopeBean1() {
        singletonScopeBean.setId(3L);
        singletonScopeBean.setName("SingletonScope New");
        return singletonScopeBean;
    }

    public SingletonScopeBeanP setSingletonScopeBean2() {
        singletonScopeBean.setId(4L);
        return singletonScopeBean;
    }

}
