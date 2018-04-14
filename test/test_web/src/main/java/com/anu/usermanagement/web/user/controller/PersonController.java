package com.anu.usermanagement.web.user.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import com.anu.usermanagement.user.entitys.Person;
import com.anu.usermanagement.user.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired(required=false)
	private PersonService personService;
	
	/*@Autowired(required=true)
	@Qualifier(value="personService")
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}*/
	
	
	
	@RequestMapping(value ="persons",method = RequestMethod.GET)
	public String show1(Model model)
	{
		model.addAttribute("personBean", new PersonBean());
		model.addAttribute("listPersons", this.personService.listPersons());
		
		System.out.println("PersonBean controller");
		return "user/person";
		
	}
	//For add and update person both
	/*@RequestMapping(value= "/person/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("personBean") PersonBean personBean){
		
		personService.addPerson(personBean);
		
		return "redirect:/persons";
		
	}*/
	

	@RequestMapping(value = "/person/add", method = RequestMethod.POST)
	   public ModelAndView addEmployee(PersonBean personBean,BindingResult result,ModelMap map) throws IOException {
		
		
		ModelAndView mv=new ModelAndView("redirect:/persons");
		
		personService.addPerson(personBean);
		
	      System.out.println("add employee controller");
	      
	      //return new ModelAndView("redirect:employeelistMethod");
	      return mv;
	   }
	
	@RequestMapping("remove")
    public String removePerson(@RequestParam int id){
		System.out.println("deleate employee controller"+id);
        personService.removePerson(id);
        System.out.println("deleate employee "+id);
        return "redirect:/persons";
    }
	
	 @RequestMapping("/edit/{id}")
	    public String editPerson(@PathVariable("id") int id, Model model){
	        model.addAttribute("personBean", this.personService.getPersonById(id));
	        Person personById = personService.getPersonById(id);
	        System.out.println("aaaaa======"+personById.getCountry());
	        model.addAttribute("listPersons", this.personService.listPersons());
	       /* List<Person> persons = personService.listPersons();
	        for (Person person : persons) {
				System.out.println(person.getCountry());
			}*/
	        System.out.println();
	        return "user/person";
	    }
	
	}
	

	

