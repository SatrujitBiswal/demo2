package com.Transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Transport.entity.Bus;
// pull
public interface BusRepository extends JpaRepository<Bus, Long>{

}
