package com.example.springinterviewpractice.java_new_features.record;

import lombok.Builder;

@Builder
public record Employee(
        int id,
        String name,
        String dept,
        String address
){
    public void displayEmployee() {
        System.out.println(this);
    }
}
