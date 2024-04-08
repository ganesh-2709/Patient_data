package com.Patient_Data.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Patient_Data.Entity.Patient_details;
@Repository
public interface Patient_Repo extends JpaRepository<Patient_details,Integer>{

}