package com.example.springinterviewpractice.scope.prototype.singleton;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@Scope("singleton")
@Data
public class SingletonScopeBeanP {
    private Long id;
    private String name;
}
