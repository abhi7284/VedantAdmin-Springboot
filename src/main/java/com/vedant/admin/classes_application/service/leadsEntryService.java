package com.vedant.admin.classes_application.service;

import java.util.List;

import com.vedant.admin.classes_application.model.Leads_Entry;

public interface leadsEntryService {
	
	void saveLead(Leads_Entry lead);
	List<Leads_Entry> getAllLeads();

}
