package com.anu.usermanagement.user.entitys;/**
 * 
 */


import java.io.Serializable;

import javassist.SerialVersionUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author AS00328698
 *
 */
	@Entity 
	@Table(name="EMPLOYEE")
	public class Employee implements Serializable 
	{   
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id    
		@Column(name="ID") 
		@GeneratedValue    
		private Integer id;    
		@Column(name="FIRSTNAME")    
		private String firstName;    
		@Column(name="LASTNAME")    
		private String lastName;    
		@Column(name="EMAIL")    
		private String email;    
		@Column(name="TELEPHONE")  
		private String telephone;
		
		@OneToOne(mappedBy="employee", cascade=CascadeType.ALL)
	    private User user;
		
		
		
		
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
}
