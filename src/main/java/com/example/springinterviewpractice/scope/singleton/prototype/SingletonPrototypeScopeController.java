package com.example.springinterviewpractice.scope.singleton.prototype;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("singleton-prototype")
@AllArgsConstructor
public class SingletonPrototypeScopeController {

    private SingletonScopeBean singletonScopeBean;
    private SingletonScopeBean1 singletonScopeBean1;
    private SingletonScopeLookupBean singletonScopeLookupBean;

    /*From this example we can say that -
    singletonScopeBean -> prototypeScopeBean
    SingletonScopeBean1 -> prototypeScopeBean1
    So here prototypeScopeBean and prototypeScopeBean1 are different object.
    And these get created only once.
    If we want different prototype scope bean on each and everytime execution of singletonScope Bean method than
    we need to use @Lookup annotation get new bean object by method injection.
    * */
    @GetMapping("prototype")
    public List<PrototypeScopeBean> getProtoScopeBean() {
        return List.of(
                singletonScopeBean.setProtoScopeBean(), singletonScopeBean1.setProtoScopeBean()
        );
    }

    @GetMapping("prototype1")
    public List<PrototypeScopeBean> getProtoScopeBean1() {
        return List.of(
                singletonScopeBean.setProtoScopeBean1(), singletonScopeBean1.setProtoScopeBean1()
        );
    }

    @GetMapping("prototype2")
    public List<PrototypeScopeBean> getProtoScopeBean2() {
        return List.of(
                singletonScopeBean.setProtoScopeBean(), singletonScopeBean1.setProtoScopeBean(),
                singletonScopeBean.setProtoScopeBean1(), singletonScopeBean.setProtoScopeBean2(),
                singletonScopeBean1.setProtoScopeBean1(), singletonScopeBean1.setProtoScopeBean2()
        );
    }

    @GetMapping("prototype-lookup")
    public PrototypeScopeBean getProtoTypeLookupScopeBean() {
        return singletonScopeLookupBean.setProtoScopeBean();
    }

    @GetMapping("prototype-lookup1")
    public PrototypeScopeBean getProtoTypeLookupScopeBean1() {
        return singletonScopeLookupBean.setProtoScopeBean1();
    }

    @GetMapping("prototype-lookup2")
    public PrototypeScopeBean getProtoTypeLookupScopeBean2() {
        return singletonScopeLookupBean.setProtoScopeBean2();
    }

}
