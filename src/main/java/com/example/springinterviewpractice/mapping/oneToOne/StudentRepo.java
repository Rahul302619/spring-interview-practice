package com.example.springinterviewpractice.mapping.oneToOne;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
