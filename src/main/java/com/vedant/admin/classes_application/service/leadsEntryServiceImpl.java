package com.vedant.admin.classes_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedant.admin.classes_application.model.Leads_Entry;
import com.vedant.admin.classes_application.repository.leadsEntryRepo;

@Service
public class leadsEntryServiceImpl implements leadsEntryService{

	@Autowired
	leadsEntryRepo LeadsEntryRepository;
	
	//Save A Lead By 
	@Override
	public void saveLead(Leads_Entry lead) {//-->Start
			LeadsEntryRepository.save(lead);
	}//-->End

	@Override
	public List<Leads_Entry> getAllLeads() {
		List<Leads_Entry> list = LeadsEntryRepository.findAll();
		return list;
	}
	
	
	
	
	
	

}
