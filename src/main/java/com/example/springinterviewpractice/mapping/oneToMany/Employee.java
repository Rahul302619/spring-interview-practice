package com.example.springinterviewpractice.mapping.oneToMany;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Table(name = "jpa_employee")
@Getter
@Setter
@EqualsAndHashCode
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String name;

    /*
    * 1) @OneToMany(FetchType.LAZY) -> It will create seperate table for maintaining the Employee and address key because it will not
    *       create FK in the Employee table because it have one-to-many relation with address because in this case
    *       one employee will have multiple address that's why by adding FK in employee table will not resolve this.
    *
    * 2) @ManyToOne(FetchType.EAGER) -> if we use this annotation then it will create FK in the mentioned table or entity please check
    *       Address entity.
    *
    * 3) So in bidirectional relationship always use mappedBy and give ownership to ManyToOne so that
    *    extra table will not get created.
    *
    * 4) Since FK is manage by ManyToOne that's why always add CascadeType on the ManyToOne side so that while saving address
    *       It will add the FK
    *
    * */
    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    private Set<Address> address;
}
