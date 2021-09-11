package com.vedant.admin.classes_application.service;

import java.util.List;

import com.vedant.admin.classes_application.model.locations;

public interface locationsService {
	
	List<locations> getAllLocation();
	void save(locations Location);
	locations getLocationById(int id);

}
