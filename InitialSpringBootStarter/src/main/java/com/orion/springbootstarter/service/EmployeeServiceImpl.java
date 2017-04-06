package com.orion.springbootstarter.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.orion.springbootstarter.model.EmployeeInfo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public EmployeeInfo getEmployee(String id) {
		// TODO Auto-generated method stub
		Map<String, EmployeeInfo> employeeMap = new HashMap<>();

		EmployeeInfo employee = new EmployeeInfo();
		employee.setEmployeeDepartment("IT");
		employee.setEmployeeDesignation("Executive");
		employee.setEmployeeId(11);
		employee.setEmployeeName("Swathi");

		EmployeeInfo employee1 = new EmployeeInfo();
		employee1.setEmployeeDepartment("HR");
		employee1.setEmployeeDesignation("HR Manager");
		employee1.setEmployeeId(12);
		employee1.setEmployeeName("Reshma");

		EmployeeInfo employee2 = new EmployeeInfo();
		employee2.setEmployeeDepartment("IT Head");
		employee2.setEmployeeDesignation("Director");
		employee2.setEmployeeId(13);
		employee2.setEmployeeName("Revathi");

		EmployeeInfo employee3 = new EmployeeInfo();
		employee3.setEmployeeDepartment("Staff");
		employee3.setEmployeeDesignation("Senior Technical Staff");
		employee3.setEmployeeId(14);
		employee3.setEmployeeName("Radhika");

		EmployeeInfo employee4 = new EmployeeInfo();
		employee4.setEmployeeDepartment("Finance");
		employee4.setEmployeeDesignation("Finance officer");
		employee4.setEmployeeId(15);
		employee4.setEmployeeName("Seetha");

		employeeMap.put("1", employee);
		employeeMap.put("2", employee1);
		employeeMap.put("3", employee2);
		employeeMap.put("4", employee3);
		employeeMap.put("5", employee4);

		EmployeeInfo empInfo = getEmployee(employeeMap, id);

		return empInfo;

	}

	public EmployeeInfo getEmployee(Map<String, EmployeeInfo> employeeMap, String id) {
		if (employeeMap.containsKey(id))
			return employeeMap.get(id);
		else
			return null;
	}

	public Map<String, EmployeeInfo> getAllEmployees() {
		Map<String, EmployeeInfo> employeeMap = new HashMap<>();

		EmployeeInfo employee = new EmployeeInfo();
		employee.setEmployeeDepartment("IT");
		employee.setEmployeeDesignation("Executive");
		employee.setEmployeeId(11);
		employee.setEmployeeName("Swathi");

		EmployeeInfo employee1 = new EmployeeInfo();
		employee1.setEmployeeDepartment("HR");
		employee1.setEmployeeDesignation("HR Manager");
		employee1.setEmployeeId(12);
		employee1.setEmployeeName("Reshma");

		EmployeeInfo employee2 = new EmployeeInfo();
		employee2.setEmployeeDepartment("IT Head");
		employee2.setEmployeeDesignation("Director");
		employee2.setEmployeeId(13);
		employee2.setEmployeeName("Revathi");

		EmployeeInfo employee3 = new EmployeeInfo();
		employee3.setEmployeeDepartment("Staff");
		employee3.setEmployeeDesignation("Senior Technical Staff");
		employee3.setEmployeeId(14);
		employee3.setEmployeeName("Radhika");

		EmployeeInfo employee4 = new EmployeeInfo();
		employee4.setEmployeeDepartment("Finance");
		employee4.setEmployeeDesignation("Finance officer");
		employee4.setEmployeeId(15);
		employee4.setEmployeeName("Seetha");

		employeeMap.put("1", employee);
		employeeMap.put("2", employee1);
		employeeMap.put("3", employee2);
		employeeMap.put("4", employee3);
		employeeMap.put("5", employee4);

		return employeeMap;

	}

}
