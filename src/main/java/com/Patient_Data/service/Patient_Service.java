package com.Patient_Data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Patient_Data.Entity.Patient_details;
import com.Patient_Data.Repo.Patient_Repo;

@Service
public class Patient_Service {
	@Autowired
	Patient_Repo  repo;
	
	//insert patient data
	public String insertdata(Patient_details data) {
		repo.save(data);
		return "data inserted successfully";
	}
	
	//fetech only one patient details
	public Patient_details retriveDetails(int id) {
		Patient_details pd=repo.findById(id).get();
		return pd;
	}
	//fetech all patients data
	public List<Patient_details> retriveAllDetails() {
		List<Patient_details> pd= repo.findAll();
		return pd;
	}

	public String deletedata(int id) {
		repo.deleteById(id);
		return "Data Deleted from DataBase";
	}

	public String deleteAlldata() {
		repo.deleteAll();
		return "All Data Deleted from DataBase";
	}

}

