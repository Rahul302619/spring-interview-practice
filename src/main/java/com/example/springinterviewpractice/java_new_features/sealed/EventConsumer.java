package com.example.springinterviewpractice.java_new_features.sealed;

public sealed interface EventConsumer
        permits TermEventConsumer, ApprovedTermEventConsumer {

    String name="Test";// by default static and final

    void consumeEvent();

    default void commonFunctionForAllImplementation() {
        System.out.println("--Message from default method--");
    }

    static void utilityFunctionForAllImplementation(EventConsumer eventConsumer){
        System.out.println("--Message from static method--" + eventConsumer);
    }
}

record TermEventConsumer(String term) implements EventConsumer {
    @Override
    public void consumeEvent() {
        System.out.println("--Message from TermEventConsumer-- " +  term);
    }
}

record ApprovedTermEventConsumer() implements EventConsumer {
    @Override
    public void consumeEvent() {
        System.out.println("--Message test from ApprovedTermEventConsumer--");
    }
}