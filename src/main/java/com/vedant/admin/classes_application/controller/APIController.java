package com.vedant.admin.classes_application.controller;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vedant.admin.classes_application.model.locations;
import com.vedant.admin.classes_application.service.locationsService;

@RestController
public class APIController {
	
	@Autowired
	locationsService LocationService;
	
	
	
	
	/* ------------- Ajax Call REST API Controllers ----------------------*/
	
	//Get District Data From State Name Ajax Call	
	@GetMapping("/state/{state}")
	public HashSet districtAPI(@PathVariable(name = "state") String state) {
		HashSet districtList = new HashSet<>();
	
			List<locations> list = LocationService.getAllLocation();
			
			
						
			for ( locations e : list ) {
							
				
				if( ((e.getState()).toLowerCase()).equals(state.toLowerCase())) {
					
					if(e.getStatus_code() == 3)
					{
						if(e.getIs_temp()==0) {
							districtList.add(e.getDistrict());
						}
					}
					
				}
						
			}
		return districtList;
	}



//Get Block Data From District Name Ajax Call	

@GetMapping("/district/{district}")
public HashSet blockAPI(@PathVariable(name = "district") String district) {
	HashSet blockList = new HashSet<>();

		List<locations> list = LocationService.getAllLocation();
		

		
		for ( locations e : list ) {
						
			
			if((e.getDistrict()).toString().equals(district)) {
				
				if(e.getStatus_code() == 3) {
					if(e.getIs_temp()==0) {
						blockList.add(e.getBlock());
					}
				}
				
			}
			
			
		}
	return blockList;
}

//Get Panchayat Data From Block Name Ajax Call	
@GetMapping("/block/{block}")
public HashSet panchayatAPI(@PathVariable(name = "block") String block) {
	HashSet panchayatList = new HashSet<>();

		List<locations> list = LocationService.getAllLocation();
		

		
		for ( locations e : list ) {
						
			
			if((e.getBlock()).toString().equals(block)) {
				
				if(e.getStatus_code() == 3) {
					if(e.getIs_temp()==0) {
						panchayatList.add(e.getPanchayat());
					}
				}
			}
			
			
		}
	return panchayatList;
}

//Get Village Data From Panchayat Name Ajax Call	

@GetMapping("/panchayat/{panchayat}")
public HashSet villageAPI(@PathVariable(name = "panchayat") String panchayat) {
	HashSet villageList = new HashSet<>();

		List<locations> list = LocationService.getAllLocation();
		

		
		for ( locations e : list ) {
						
			
			if((e.getPanchayat()).toString().equals(panchayat)) {
				if(e.getStatus_code() == 3) {
					if(e.getIs_temp()==0) {
						villageList.add(e.getVillage());
					}
					
				}
			}
			
			
		}
	return villageList;
}

//Get Link Branch Data From Village Name Ajax Call	

@GetMapping("/village/{village}")
public HashSet linkBranchAPI(@PathVariable(name = "village") String village) {
	HashSet linkBranchList = new HashSet<>();

		List<locations> list = LocationService.getAllLocation();
			for ( locations e : list ) {
						
			
			if((e.getVillage()).toString().equals(village)) {
				if(e.getStatus_code() == 3) {
					if(e.getIs_temp()==0) {
						linkBranchList.add(e.getLinkbranch());
					}
				}
			}
			
			
		}
	return linkBranchList;
}

//Get Distance From link Branch
@GetMapping("/linkBranch/{linkBranch}")
public HashSet getDistanceAPI(@PathVariable(name = "linkBranch") String linkBranch){
	
	HashSet linkBranchList = new HashSet<>();

	List<locations> list = LocationService.getAllLocation();
		for ( locations e : list ) {
					
		
		if((e.getLinkbranch()).toString().equals(linkBranch)) {
			if(e.getStatus_code() == 3) {
				if(e.getIs_temp()==0) {
					linkBranchList.add(e.getDistance());
				}
			}
		}
		
		
	}
return linkBranchList;
	
}

//Get Distance From link Branch
@GetMapping("/id/{village}")
public int getIdAPI(@PathVariable(name = "village") String village){
	int location_id = 0;
	List<locations> list = LocationService.getAllLocation();
		for ( locations e : list ) {
					
		
		if((e.getVillage()).toString().equals(village)) {
			if(e.getStatus_code() == 3) {
				if(e.getIs_temp()==0) {
					location_id = e.getId();
				}
			}
		}
		
		
	}
return location_id;
	
}





}
