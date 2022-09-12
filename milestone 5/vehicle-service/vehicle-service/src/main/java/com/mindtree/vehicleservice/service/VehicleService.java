package com.mindtree.vehicleservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vehicleservice.entity.Vehicle;
import com.mindtree.vehicleservice.repository.VehicleRepo;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepo repository;
	
	public void saveVehicle(Vehicle vehicle) {
		repository.save(vehicle);
	}

}
