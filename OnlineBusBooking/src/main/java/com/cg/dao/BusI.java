package com.cg.dao;
import com.cg.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusI extends JpaRepository<Bus, Integer> {

}
