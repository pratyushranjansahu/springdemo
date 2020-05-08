package com.workshop.springdemo.entity;

public class EmployeeFactoryDTO {
	  private Integer id;
	    private String firstName;
	    private String lastName;
	    public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		private String designation;
		@Override
		public String toString() {
			return "EmployeeFactoryDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", designation=" + designation + "]";
		}
	 
}
