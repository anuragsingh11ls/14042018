package com.anu.usermanagement.user.serviceimpl;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.user.bean.PersonBean;
import com.anu.usermanagement.user.dao.PersonDAO;
import com.anu.usermanagement.user.entitys.Employee;
import com.anu.usermanagement.user.entitys.Person;
import com.anu.usermanagement.user.service.PersonService;
import com.test.xsd.Person1;

@Service
//@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class PersonServiceImpl implements PersonService {
	@Autowired(required=true)
	private PersonDAO personDAO;
	private static final String FILE_NAME = "D:\\customer.xml";




	//@Override
	@Transactional
	public void addPerson(PersonBean p)  {
		
		//XMLConverter xmlconverter=new XMLConverter();
		//final String XML_FILE_NAME = "C:\\Users/Anurag Singh/Desktop/customer.xml";
		Person employee = new Person();
		employee.setId(p.getId());
		employee.setName(p.getName());
		employee.setCountry(p.getCountry());
		
		
		Person1 p1=new Person1();
		//p1.setId(1);
		p1.setName(p.getName());
		p1.setCountry(p.getCountry());
		System.out.println("Convert Object to XML!");
		//from object to XML file
		
		
		
		/******************** Marshalling example *****************************/
	     
	    //JAXBContext jaxbContext;
		try {
			
			
			 JAXBContext context = JAXBContext.newInstance(Person1.class);
	            Marshaller m = context.createMarshaller();
	            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	           // m.marshal(p1, new File(FILE_NAME));
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
     
    
        //System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());  
		personDAO.addPerson(employee);
	}

	

	//@Override
	@Transactional
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	@Transactional
	public Person getPersonById(int id) {
		return this.personDAO.getPersonById(id);
	}

	//@Override
	@Transactional
	//@Scope("Request")
	public void removePerson(int id) {
		personDAO.removePerson(id);
		System.out.println("deleate "+id);
	}

}
