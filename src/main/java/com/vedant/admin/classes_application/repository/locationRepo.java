package com.vedant.admin.classes_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedant.admin.classes_application.model.locations;

@Repository
public interface locationRepo extends JpaRepository<locations, Integer> {

}
