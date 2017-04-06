package com.orion.springbootstarter.service;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.orion.springbootstarter.model.EmployeeInfo;

@Component
public interface EmployeeService {

	public EmployeeInfo getEmployee(String id);

	public Map<String, EmployeeInfo> getAllEmployees();

}
