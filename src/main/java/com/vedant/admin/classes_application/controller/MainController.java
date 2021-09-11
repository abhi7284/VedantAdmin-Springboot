package com.vedant.admin.classes_application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vedant.admin.classes_application.model.Leads_Entry;
import com.vedant.admin.classes_application.service.leadsEntryService;
import com.vedant.admin.classes_application.service.locationsService;
import com.vedant.admin.classes_application.model.locations;

@Controller
public class MainController {
	
	@Autowired
	leadsEntryService LeadsEntryService;
	
	@Autowired
	locationsService LocationsService;
	
	
	//Home Page Mapping
	@GetMapping
	public String home() {
		return "index.html";
	}
	
	//Approved Location Leads Entry Form Page
	@GetMapping("/approved_location")
	public String approvedLocation(Model model)
	{	
		model.addAttribute("lead", new Leads_Entry());
		return "approved_location";
	}
	
	//Approved Location POST Form Data Save 
		@PostMapping("/save-lead")
		public String leadSubmit(@ModelAttribute Leads_Entry leads){
			
			//Exception Handling For Personal Table
			try{
				
				LeadsEntryService.saveLead(leads);
			}
			catch(Exception e){
				return "error";
			}
			  
		    return "successLead";
		  }
		

		//Approved Location View Lead
		@GetMapping("/view_leads")
		public String viewLeads(Model model)
		  	{	
			List<Leads_Entry> list = LeadsEntryService.getAllLeads();
			//List<locations> locationList = LocationsService.getAllLocation();
			//model.addAttribute("locList",locationList);
			  model.addAttribute("list",list);

			return "view_leads";
		  	}
	
	
	

}
