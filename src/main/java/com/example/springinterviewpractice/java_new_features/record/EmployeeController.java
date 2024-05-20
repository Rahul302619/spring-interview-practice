package com.example.springinterviewpractice.java_new_features.record;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @PostMapping
    public EmployeeResponse postEmployee(@RequestBody Employee employee){
        employee.displayEmployee();
        var modifiedEmployee = Employee.builder()
                .name(employee.name().toUpperCase())
                .build();
        System.out.println(modifiedEmployee);
        return new EmployeeResponse(employee.id(), employee.name());
    }
}
