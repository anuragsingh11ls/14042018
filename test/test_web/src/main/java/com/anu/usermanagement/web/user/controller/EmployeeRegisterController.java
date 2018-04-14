package com.anu.usermanagement.web.user.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anu.usermanagement.user.bean.EmployeeBean;
import com.anu.usermanagement.user.bean.PersonBean;
import com.anu.usermanagement.user.entitys.Employee;
import com.anu.usermanagement.user.service.EmployeeRegisterService;

@Controller
public class EmployeeRegisterController {
	
	
	@Autowired(required=true)
	private EmployeeRegisterService employeeRegisterService;
	
	
	
	

    /*@RequestMapping(value = "employeelistMethod", method = RequestMethod.GET)
    public String showEmployeeForm(EmployeeBean employeeBean,ModelMap map) {
    	 map.addAttribute("employeeList", employeeRegisterService.getAllEmployees());
		
    	System.out.println("tytyty");
        return "employeeListPage";
    }*/

	@RequestMapping(value ="registerPage",method = RequestMethod.GET)
	public String show1(EmployeeBean employeeBean)
	{
		
		System.out.println("Employee controller");
		return "user/employeeRegister";
		
	}
	
	
	
	
	
	
	
	@RequestMapping(value = "addEmployee", method = RequestMethod.POST)
	   public ModelAndView addEmployee(EmployeeBean employeeBean,BindingResult result,ModelMap map) {
		
		
		ModelAndView mv=new ModelAndView("user/employeeRegister");
		if (result.hasErrors()) {
    		System.out.println("am in error method");
    		return mv;
    	}else {

		
		employeeRegisterService.addEmployee(employeeBean);
		
		 map.addAttribute("employeeList", employeeRegisterService.getAllEmployees());
	      System.out.println("add employee controller");
	      
	      //return new ModelAndView("redirect:employeelistMethod");
	      return mv;
	   }
	}
	
	 @RequestMapping("delete")
		public ModelAndView deleteEmployee(@RequestParam Integer id)
		{
		 employeeRegisterService.deleteEmployee(id);
		// map.addAttribute("employeeList", employeeRegisterService.getAllEmployees());
			return new ModelAndView("redirect:employeelistMethod");
		}

	 @RequestMapping(value = "employeelistMethod", method = RequestMethod.GET)
	    public ModelAndView showEmployeeForm(EmployeeBean employeeBean,ModelMap map) {
		 
	    	 map.addAttribute("employeeList", employeeRegisterService.getAllEmployees());
			
			
			List employeeList = employeeRegisterService.getAllEmployees();  
			
	    	System.out.println("asdf");
	    	return new ModelAndView("user/employeeList", "employeeList", employeeList);
	    	
	        //return new ModelAndView("employeeListPage", "employeeList", employeeList);//"employeeListPage";
	    }
	 
	 /*@RequestMapping("edit")
		public ModelAndView editEmployee(@PathVariable int id)
		{
		 System.out.println("aaaaaaa"+id);
		 
			Employee employee = employeeRegisterService.getEmployeeId(id);
	        return new ModelAndView("user/employeeEdit","command",employee); 
		
		}*/

	 @RequestMapping("edit")
		public ModelAndView editEmployee(@RequestParam int id,ModelMap map)
		{
		 ModelAndView modelAndView = new ModelAndView("user/employeeEdit");
		 
		 System.out.println("bbbbbbbbbb"+id);
		         Employee team = employeeRegisterService.getEmployeeId(id);
		         System.out.println("ccccc"+id);
		         modelAndView.addObject("team",team);

		 System.out.println("bbbbbbbbbb"+id);
		 //employeeRegisterService.getEmployeeById(id);
		 /*map.addAttribute("employeeList", employeeRegisterService.getEmployeeId(id));
		 return new ModelAndView("user/employeeEdit");*/
		return modelAndView;
		}

	 
}
