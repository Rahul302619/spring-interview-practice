package com.example.springinterviewpractice.scope.prototype.singleton;

import com.example.springinterviewpractice.scope.singleton.prototype.PrototypeScopeBean;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("prototype-singleton")
@AllArgsConstructor
public class PrototypeSingletonScopeController {

    private PrototypeScopeBeanP prototypeScopeBeanP;
    private PrototypeScopeBeanP1 prototypeScopeBeanP1;

    @GetMapping("singleton")
    public List<SingletonScopeBeanP> getProtoScopeBean() {
        return List.of(
                prototypeScopeBeanP.setSingletonScopeBean(), prototypeScopeBeanP1.setSingletonScopeBean()
        );
    }

    @GetMapping("singleton1")
    public List<SingletonScopeBeanP> getProtoScopeBean1() {
        return List.of(
                prototypeScopeBeanP.setSingletonScopeBean1(), prototypeScopeBeanP1.setSingletonScopeBean1()
        );
    }

    @GetMapping("singleton2")
    public List<SingletonScopeBeanP> getProtoScopeBean2() {
        return List.of(
                prototypeScopeBeanP.setSingletonScopeBean(), prototypeScopeBeanP1.setSingletonScopeBean(),
                prototypeScopeBeanP.setSingletonScopeBean1(), prototypeScopeBeanP1.setSingletonScopeBean1(),
                prototypeScopeBeanP.setSingletonScopeBean2(), prototypeScopeBeanP1.setSingletonScopeBean2()
        );
    }
}
