package com.anu.usermanagement.user.dao; 
import java.util.List;

import com.anu.usermanagement.core.dao.AbstractDao;
import com.anu.usermanagement.user.entitys.Employee;
 public interface EmployeeDAO extends AbstractDao<Employee, String>
{ 
    public void addEmployee(Employee employee); 
    public List<Employee> getAllEmployees(); 
    public void deleteEmployee(Integer employeeId); 
    public Employee getEmployeeById(String employeeId); 
    
    
   // public void updateTeam(Employee employee);
    public Employee getTeam(int id);

}