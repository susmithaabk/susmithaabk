package com.orion.springbootstarter.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orion.springbootstarter.model.EmployeeInfo;
import com.orion.springbootstarter.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/{id}")
	public EmployeeInfo getEmployeeInfo(@PathVariable("id") String id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping("/all")
	public Map<String, EmployeeInfo> getAllEmployee() {
		return employeeService.getAllEmployees();
	}
}
