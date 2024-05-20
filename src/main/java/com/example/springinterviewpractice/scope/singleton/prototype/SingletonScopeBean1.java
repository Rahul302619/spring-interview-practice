package com.example.springinterviewpractice.scope.singleton.prototype;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@AllArgsConstructor
public class SingletonScopeBean1 {

    private PrototypeScopeBean prototypeScopeBean;

    public PrototypeScopeBean setProtoScopeBean() {
        return prototypeScopeBean;
    }

    public PrototypeScopeBean setProtoScopeBean1() {
        prototypeScopeBean.setId(3L);
        prototypeScopeBean.setName("ProtoScope New");
        return prototypeScopeBean;
    }

    public PrototypeScopeBean setProtoScopeBean2() {
        prototypeScopeBean.setId(4L);
        return prototypeScopeBean;
    }

}
