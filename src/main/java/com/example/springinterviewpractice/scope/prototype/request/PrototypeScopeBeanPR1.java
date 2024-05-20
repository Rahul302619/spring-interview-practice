package com.example.springinterviewpractice.scope.prototype.request;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@AllArgsConstructor
public class PrototypeScopeBeanPR1 {

    private RequestScopeBeanP requestScopeBeanP;

    public RequestScopeBeanP setRequestScopeBeanP() {
        return requestScopeBeanP;
    }

}
