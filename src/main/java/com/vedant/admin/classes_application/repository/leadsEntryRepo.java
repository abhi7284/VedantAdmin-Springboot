package com.vedant.admin.classes_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedant.admin.classes_application.model.Leads_Entry;

@Repository
public interface leadsEntryRepo extends JpaRepository<Leads_Entry, Integer>{

}
