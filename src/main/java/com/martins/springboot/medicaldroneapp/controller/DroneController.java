package com.martins.springboot.medicaldroneapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.martins.springboot.medicaldroneapp.DAO.DroneRepository;
import com.martins.springboot.medicaldroneapp.model.Drone;


@RestController
public class DroneController {

	@Autowired
	private DroneRepository repo;
	
	
	@PostMapping("/createdrone")
	
		public String createDrone(@RequestBody Drone drone) {
		repo.save(drone);
		return "Successful";
	}
	
	@GetMapping("/findalldrones")
	public List<Drone> findAllDrones() {
		return repo.findAll();
	}
	
	@GetMapping("/finddronesbyid/{serialNumber}")
	public Optional<Drone> findDronesBySerialNumber(@PathVariable int serialNumber){
		return repo.findById(serialNumber);
	}
	
	@DeleteMapping("/deletedronebyid/{serialNumber}")
	public String deleteDroneById(@PathVariable int serialNumber){
		repo.deleteById(serialNumber);
		return "Drone Deleted";
	}
}
