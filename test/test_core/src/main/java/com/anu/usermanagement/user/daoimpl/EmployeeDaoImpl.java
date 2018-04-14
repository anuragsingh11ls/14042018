package com.anu.usermanagement.user.daoimpl;
 import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.impl.AbstractDaoImpl;
import com.anu.usermanagement.user.dao.EmployeeDAO;
import com.anu.usermanagement.user.entitys.Employee;

 
@Repository("employeeDAO")
 public class EmployeeDaoImpl extends AbstractDaoImpl<Employee, String> implements EmployeeDAO 
 {
	
	//private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);


	protected EmployeeDaoImpl() {
		super(Employee.class);
		// TODO Auto-generated constructor stub
	}

	
	public void addEmployee(Employee employee) {
		
		System.out.println("core method");
		//getCurrentSession().save(employee);
		saveOrUpdate(employee);
		
	}

	/*@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = getCurrentSession().createQuery("from Employee")   
				 .list();   

		return employeeList;
	}*/

	public void deleteEmployee(Integer employeeId) {
		
		Employee employee = (Employee) getCurrentSession().load(Employee.class, employeeId);   

		delete(employee);
		
	}

	public Employee getEmployeeById(String employeeId) {
		Employee employee = (Employee) getCurrentSession().load(Employee.class, employeeId);
		System.out.println("aaaaaaaaaaaaaa"+employeeId);
		return findById(employeeId);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = getCurrentSession().createQuery("from Employee")   
				 .list();   
	
		return employeeList;

	}


	
	public Employee getTeam(int id) {
		
		System.out.println("dddd"+id);
		
		
		Employee p = (Employee) getCurrentSession().load(Employee.class, new Integer(id));
		//logger.info("Person loaded successfully, Person details="+p);
		//findById(id);
		//Employee team = (Employee) getCurrentSession().get(Employee.class, id);
		
		//System.out.println("eeeee"+team.getFirstName());
		
		return p;
	}
	
	
 } 
