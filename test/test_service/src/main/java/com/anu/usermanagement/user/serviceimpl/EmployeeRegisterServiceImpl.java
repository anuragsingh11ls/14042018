package com.anu.usermanagement.user.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.user.bean.EmployeeBean;
import com.anu.usermanagement.user.dao.EmployeeDAO;
import com.anu.usermanagement.user.dao.UserDao;
import com.anu.usermanagement.user.entitys.Employee;
import com.anu.usermanagement.user.entitys.User;
import com.anu.usermanagement.user.service.EmployeeRegisterService;

@Service("employeeManager")
//@Scope("prototype")
public class EmployeeRegisterServiceImpl implements EmployeeRegisterService {
	@Autowired(required=true)
	EmployeeDAO employeeDAO;
	
	@Autowired
	UserDao userDao;//this injuction is interface injection

	/*@Override
	@Transactional
	public void addEmployee(EmployeeBean employeeBean) {
		System.out.println("44444444444");
		
		//BeanUtils.copyProperties(employee, employee);
		employeeDAO.addEmployee(employee);
		System.out.println("Service Method");
	}*/
	//this injuction is constructor injuction
	/*@Autowired
	public EmployeeRegisterServiceImpl(EmployeeDAO employeeDAO, UserDao userDao) {
		super();
		this.employeeDAO = employeeDAO;
		this.userDao = userDao;
	}*/
	
	

	/*@Autowired this injuction is setter based injuction
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}*/



	@Transactional
	@Scope("Request")
	public void deleteEmployee(Integer employeeId) {
		
		
		employeeDAO.deleteEmployee(employeeId);
	}

	@Transactional
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		//Employee employee = new Employee();
		return employeeDAO.getAllEmployees();
	}


	public Employee getEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(employeeId);
	}


	@Transactional
	public void addEmployee(EmployeeBean employeeBean) {
		
		Employee employee = new Employee();
		User user=new User();
		employee.setFirstName(employeeBean.getFirstName());
		employee.setLastName(employeeBean.getLastName());
		employee.setEmail(employeeBean.getEmail());
		employee.setTelephone(employeeBean.getTelephone());
		user.setUserName(employeeBean.getUserName());
		user.setPassword(employeeBean.getPassword());
		//BeanUtils.copyProperties(employeeBean, employee);
		
		employeeDAO.addEmployee(employee);
		userDao.addUser(user);
		
	}


	public Employee getEmployeeId(int id) {
		System.out.println("sssssssssssss"+id);
		// TODO Auto-generated method stub
		return this.employeeDAO.getTeam(id);
	}


	
	
}
