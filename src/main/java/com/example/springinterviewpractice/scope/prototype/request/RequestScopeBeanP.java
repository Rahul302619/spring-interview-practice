package com.example.springinterviewpractice.scope.prototype.request;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Data
public class RequestScopeBeanP {
    private Long id;
    private String name;
}
