package com.Patient_Data.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Patient_Data.Entity.Patient_details;
import com.Patient_Data.service.Patient_Service;

@RequestMapping("/patient/")
@RestController
public class Http_Controller {
	@Autowired
	private  Patient_Service service;
	
	//insert a new patient data
	@PostMapping("/insert")
	public String insertDetails(@RequestBody Patient_details data) {

		return service.insertdata(data);

	}
	
	//retrive only one patient data
	@GetMapping("/getdata/{id}")
	public Patient_details retriveDetails(@PathVariable() int id) {

		return service.retriveDetails(id);

	}
	
	//retrive all  patients data
	@GetMapping("/getalldata")
	public List<Patient_details> retriveAllDetails() {

		return service.retriveAllDetails();

	}
	
	//updating patients data
	@PutMapping("/update")
	public String updateDetails(@RequestBody Patient_details data) {

		return service.insertdata(data);

	}
	
	//delete single patients data
	@DeleteMapping("/remove/{id}")
	public String deleteDetails(@PathVariable() int id)
	{
		return service.deletedata(id);
	}
	
	//delete all patients data
	@DeleteMapping("/remove")
	public String deleteAllDetails()
	{
		return service.deleteAlldata();
	}
	

}

