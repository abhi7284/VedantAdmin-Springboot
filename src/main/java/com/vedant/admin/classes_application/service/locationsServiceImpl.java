package com.vedant.admin.classes_application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedant.admin.classes_application.model.locations;
import com.vedant.admin.classes_application.repository.locationRepo;

@Service
public class locationsServiceImpl implements locationsService {
	
	@Autowired
	locationRepo LocationRepo;
	
	//Get All Location Table From Data-Base
	@Override
	public List<locations> getAllLocation() {
		
		List<locations> list = LocationRepo.findAll();
		
		return list;
	}

	@Override
	public void save(locations Location) {
		LocationRepo.save(Location);
		
	}

	@Override
	public locations getLocationById(int id) {
		Optional < locations > optional = LocationRepo.findById(id);
        locations Location = null;
        Location = optional.get();
		return Location;
	}
	
	

}
