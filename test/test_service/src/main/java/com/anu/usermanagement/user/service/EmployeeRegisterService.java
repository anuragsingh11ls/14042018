package com.anu.usermanagement.user.service;



import java.util.List;

import com.anu.usermanagement.user.bean.EmployeeBean;
import com.anu.usermanagement.user.entitys.Employee;

public interface EmployeeRegisterService {
	public void addEmployee(EmployeeBean employeeBean);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);
	 public Employee getEmployeeById(String employeeId);   
	 
	 public Employee getEmployeeId(int id);
}
