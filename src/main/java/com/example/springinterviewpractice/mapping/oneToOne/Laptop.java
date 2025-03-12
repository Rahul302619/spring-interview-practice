package com.example.springinterviewpractice.mapping.oneToOne;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jpa_laptop")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student007;
}
