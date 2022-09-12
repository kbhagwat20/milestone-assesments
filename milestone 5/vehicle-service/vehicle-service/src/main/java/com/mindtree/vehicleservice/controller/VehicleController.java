package com.mindtree.vehicleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.vehicleservice.entity.Vehicle;
import com.mindtree.vehicleservice.service.VehicleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleController {

	@Autowired
	private VehicleService service;
	
	@PostMapping("/registerVehicle")
	public void saveVehicle(@RequestBody Vehicle vehicle) {
		service.saveVehicle(vehicle);
	}
}
