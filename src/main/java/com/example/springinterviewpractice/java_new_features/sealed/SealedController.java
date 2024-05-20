package com.example.springinterviewpractice.java_new_features.sealed;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("sealed")
@Slf4j
public class SealedController {

    String textBlock = """
            I am Rahul Kumar Singh
            I have total 7 yrs. of experience
            """;

    @GetMapping
    void test() {
        log.info(textBlock);
        EventConsumer termEventConsumer = new TermEventConsumer("Dummy term");
        EventConsumer approvedTermEventConsumer = new ApprovedTermEventConsumer();

        termEventConsumer.consumeEvent();
        termEventConsumer.commonFunctionForAllImplementation();
        EventConsumer.utilityFunctionForAllImplementation(termEventConsumer);

        approvedTermEventConsumer.consumeEvent();
        approvedTermEventConsumer.commonFunctionForAllImplementation();
        EventConsumer.utilityFunctionForAllImplementation(approvedTermEventConsumer);
        log.info(EventConsumer.name);
    }
}
