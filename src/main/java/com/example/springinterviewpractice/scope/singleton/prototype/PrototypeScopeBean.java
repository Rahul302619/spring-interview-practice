package com.example.springinterviewpractice.scope.singleton.prototype;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.NO)
/*
* Here proxyMode indicate what type of proxy object you want
* No -> there will be no proxy
* Interfaces -> if PrototypeScopeBean implemented interfaces than we can use this
* Target_Class -> Create proxy of the target class
* Default -> It will choose by itself
* */
@Data
public class PrototypeScopeBean {
    private Long id;
    private String name;
}
