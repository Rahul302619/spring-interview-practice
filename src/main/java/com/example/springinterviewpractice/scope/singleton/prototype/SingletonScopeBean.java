package com.example.springinterviewpractice.scope.singleton.prototype;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@AllArgsConstructor
public class SingletonScopeBean {

    private PrototypeScopeBean prototypeScopeBean;

    public PrototypeScopeBean setProtoScopeBean() {
        return prototypeScopeBean;
    }

    public PrototypeScopeBean setProtoScopeBean1() {
        prototypeScopeBean.setId(1L);
        prototypeScopeBean.setName("ProtoScope");
        return prototypeScopeBean;
    }

    public PrototypeScopeBean setProtoScopeBean2() {
        prototypeScopeBean.setId(2L);
        return prototypeScopeBean;
    }

}
