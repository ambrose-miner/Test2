package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	// http://localhost:8080
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openIndexPage(Model mm, Employee employee) {
		mm.addAttribute("name" ,"Ambrose Miner"); 
		mm.addAttribute("project", "Employee Managment");
		mm.addAttribute("aE", employee);
		List<Employee> listOfEmployees = employeeService.findAllEmployee();
		mm.addAttribute("employee", listOfEmployees);
		return "index";
	}
	@RequestMapping(value = "/storeEmployee",method = RequestMethod.POST)
	public String storeEmployee(Model mm, Employee newEmployee) {
		
		String result = employeeService.storeEmployee(newEmployee);
		mm.addAttribute("name", "HBC");
		mm.addAttribute("nE", newEmployee);
		mm.addAttribute("project", "Employee Management System");
		mm.addAttribute("msg", result);
		List<Employee> listOfEmployee = employeeService.findAllEmployee();
		mm.addAttribute("employee", listOfEmployee);
		return "index";
	}
	@RequestMapping(value = "/deleteEmployee",method = RequestMethod.GET)
	public String deleteEmployee(Model mm, Employee removedEmployee, @RequestParam("employeeId") int employeeId) {
		
		String result = employeeService.deleteEmployee(employeeId);
		mm.addAttribute("name", "HBC");
		mm.addAttribute("rE", removedEmployee);
		mm.addAttribute("project", "Employee Management System");
		mm.addAttribute("msg", result);
		List<Employee> listOfEmployee = employeeService.findAllEmployee();
		mm.addAttribute("employee", listOfEmployee); 
		return "index";
	}
}
