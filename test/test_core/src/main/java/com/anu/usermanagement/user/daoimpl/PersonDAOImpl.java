package com.anu.usermanagement.user.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.impl.AbstractDaoImpl;
import com.anu.usermanagement.user.dao.PersonDAO;
import com.anu.usermanagement.user.entitys.Employee;
import com.anu.usermanagement.user.entitys.Person;

@Repository
public class PersonDAOImpl extends AbstractDaoImpl<Person, String>implements PersonDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	protected PersonDAOImpl() {
		super(Person.class);
		// TODO Auto-generated constructor stub
	}

	
	public void addPerson(Person p) {
	/*	Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);*/
		saveOrUpdate(p);
		logger.info("Person saved successfully, Person Details="+p);
	}

	//@Override
	public void updatePerson(Person p) {
		/*Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, Person Details="+p);*/
	}

	@SuppressWarnings("unchecked")
	//@Override
	public List<Person> listPersons() {
		
		List<Person> personsList = getCurrentSession().createQuery("from Person")   
				 .list(); 
		for(Person p : personsList){
			logger.info("Person List::"+p);
		}
		return personsList;
		/*Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		for(Person p : personsList){
			logger.info("Person List::"+p);
		}
		return personsList;*/
	}

	//@Override
	public Person getPersonById(int id) {
		//return null;
		//Session session = this.sessionFactory.getCurrentSession();		
		Person p = (Person) getCurrentSession().load(Person.class, new Integer(id));
		logger.info("Person loaded successfully, Person details="+p);
		return p;
	}

	//@Override
	public void removePerson(int id) {
		Person persion = (Person) getCurrentSession().load(Person.class, id);   
		System.out.println("deleate========="+id);
		delete(persion);
		logger.info("Person deleted successfully, person details="+persion);
		
	}

}
