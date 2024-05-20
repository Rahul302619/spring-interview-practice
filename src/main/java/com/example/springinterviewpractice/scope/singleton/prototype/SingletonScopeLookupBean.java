package com.example.springinterviewpractice.scope.singleton.prototype;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@AllArgsConstructor
public class SingletonScopeLookupBean {

    @Lookup
    public PrototypeScopeBean getPrototypeBean() {
        return null;
    }

    public PrototypeScopeBean setProtoScopeBean() {
        return getPrototypeBean();
    }

    public PrototypeScopeBean setProtoScopeBean1() {
        var prototypeScopeBean = getPrototypeBean();
        prototypeScopeBean.setId(5L);
        prototypeScopeBean.setName("ProtoScope New");
        return prototypeScopeBean;
    }

    public PrototypeScopeBean setProtoScopeBean2() {
        var prototypeScopeBean = getPrototypeBean();
        prototypeScopeBean.setId(6L);
        return prototypeScopeBean;
    }
}
