package com.example.springinterviewpractice.mapping.oneToOne;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one-to-one")
@AllArgsConstructor
@Slf4j
public class OneToOneController {

    private StudentRepo studentRepo;
    private LaptopRepo laptopRepo;

    @GetMapping("oneToOne1")
    public void oneToOne1() {
        Student student = new Student();
        student.setName("Rahul");

        Laptop laptop = new Laptop();
        laptop.setBrand("HP");

        student.setOfficeLaptop(laptop);

        /*
        * Here we are not saving laptop and we are setting that inside the student so while saving the student
        * object it will give an error "object references an unsaved transient instance" because save instance have
        * the unsaved reference
        * */
        var studentTemp = studentRepo.save(student);
        log.info(studentTemp.toString());
    }

    @GetMapping("oneToOne2")
    public void oneToOne2() {
        Student student = new Student();
        student.setName("Rahul");

        Laptop laptop = new Laptop();
        laptop.setBrand("HP");

        studentRepo.save(student);

        /*
        * Storing save student entity into laptop so it will work fine and also it will store the FK of student
        * into laptop.
        * */
        laptop.setStudent007(student);
        var laptopTemp = laptopRepo.save(laptop);

        log.info(laptopTemp.toString());
    }

    @GetMapping("oneToOne3")
    public void oneToOne3() {
        Student student = new Student();
        student.setName("Rahul");

        Laptop laptop = new Laptop();
        laptop.setBrand("HP");

        /*
        * After using cascade = CascadeType.ALL we can set non saved object into the object which will get save.
        * */
        laptop.setStudent007(student);
        var laptopTemp = laptopRepo.save(laptop);

        log.info(laptopTemp.toString());
    }
}
