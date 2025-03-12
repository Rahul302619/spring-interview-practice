package com.example.springinterviewpractice.mapping.oneToMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
