package com.example.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.second.model.Address;

public interface AddressRespository extends JpaRepository<Address,Long> {
    
}
