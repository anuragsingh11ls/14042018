package com.anu.usermanagement.user.service;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.anu.usermanagement.user.bean.PersonBean;
import com.anu.usermanagement.user.entitys.Person;

public interface PersonService {

	public void addPerson(PersonBean p) ;
	//public void updatePerson(PersonBean p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}
