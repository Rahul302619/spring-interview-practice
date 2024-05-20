package com.example.springinterviewpractice.scope.request.prototype;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class PrototypeScopeBeanRP {
    private Long id;
    private String name;
}
