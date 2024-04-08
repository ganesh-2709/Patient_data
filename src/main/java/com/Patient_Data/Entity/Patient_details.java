package com.Patient_Data.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient_details {
		
		@Id
		private int id;

		private String name;

		private int age;

		private String gender;

		private String deceases;

		private String city;

		private long pincode;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDeceases() {
			return deceases;
		}

		public void setDeceases(String deceases) {
			this.deceases = deceases;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public long getPincode() {
			return pincode;
		}

		public void setPincode(long pincode) {
			this.pincode = pincode;
		}
		
		
		
		
}
