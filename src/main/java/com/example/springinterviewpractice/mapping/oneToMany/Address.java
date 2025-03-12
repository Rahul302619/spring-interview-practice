package com.example.springinterviewpractice.mapping.oneToMany;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "jpa_address")
@Getter
@Setter
@EqualsAndHashCode
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String add;

    @ManyToOne(cascade = CascadeType.ALL)
    private Employee employee;
}
