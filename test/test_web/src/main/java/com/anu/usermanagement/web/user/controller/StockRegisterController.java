package com.anu.usermanagement.web.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anu.usermanagement.user.bean.EmployeeBean;
import com.anu.usermanagement.user.bean.StockBean;
import com.anu.usermanagement.user.service.StockService;

@Controller
public class StockRegisterController {
	
	@Autowired(required=true)
	private StockService stockService;
	
	@RequestMapping(value ="stockRegisterPage",method = RequestMethod.GET)
	public String show1(StockBean stockBean)
	{
		
		System.out.println("Stock controller");
		return "stock/stockRegister";
		
	}

	@RequestMapping(value = "addStock", method = RequestMethod.POST)
	   public ModelAndView addEmployee(StockBean stockBean,BindingResult result,ModelMap map) {
		
		
		ModelAndView mv=new ModelAndView("stock/stockRegister");
		if (result.hasErrors()) {
 		System.out.println("am in error method");
 		return mv;
 	}else {

		
 		stockService.addStock(stockBean);
		
		// map.addAttribute("employeeList", stockService.getClass()AllEmployees());
	      System.out.println("add stock controller");
	      
	      //return new ModelAndView("redirect:employeelistMethod");
	      return mv;
	   }
	}
}
