package com.martins.springboot.medicaldroneapp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martins.springboot.medicaldroneapp.model.Drone;

public interface DroneRepository extends JpaRepository<Drone, Integer> {

}
