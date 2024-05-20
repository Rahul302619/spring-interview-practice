package com.example.springinterviewpractice.scope.request.singleton;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Data
public class SingletonScopeBeanRS {
    private Long id;
    private String name;
}
