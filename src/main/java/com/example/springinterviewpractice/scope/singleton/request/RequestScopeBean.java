package com.example.springinterviewpractice.scope.singleton.request;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Data
public class RequestScopeBean {
    private Long id;
    private String name;
}
