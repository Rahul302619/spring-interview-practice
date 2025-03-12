package com.example.springinterviewpractice.mapping.oneToMany;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("one-to-many")
@AllArgsConstructor
@Slf4j
public class OneToManyController {

    private EmployeeRepo employeeRepo;
    private AddressRepo addressRepo;

    @GetMapping("oneToMany1")
    public void oneToMany1() {
        Employee employee = new Employee();
        employee.setName("Rahul");
        employeeRepo.save(employee);

        Address address =  new Address();
        address.setAdd("Jamshedpur");
        addressRepo.save(address);
    }

    @GetMapping("oneToMany2")
    public void oneToMany2() {
        Employee employee = new Employee();
        employee.setName("Rahul");

        Address address =  new Address();
        address.setAdd("Jamshedpur");
        address.setEmployee(employee);
        addressRepo.save(address);

        Address address1 =  new Address();
        address1.setAdd("Jharkhand");
        address1.setEmployee(employee);
        addressRepo.save(address1);

    }

    @GetMapping("oneToMany3/{id}")
    public Address oneToMany3(@PathVariable String id) {
        Integer intId = Integer.parseInt(id);
        return addressRepo.findById(intId).get();
    }

    @GetMapping("oneToMany4/{id}")
    public Employee oneToMany4(@PathVariable String id) {
        Integer intId = Integer.parseInt(id);
        return employeeRepo.findById(intId).get();
    }
}
