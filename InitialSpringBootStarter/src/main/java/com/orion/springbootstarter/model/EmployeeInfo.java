package com.orion.springbootstarter.model;

public class EmployeeInfo {

	private String employeeName;
	private int employeeId;
	private String employeeDesignation;
	private String employeeDepartment;

	public EmployeeInfo() {

	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeDesignation
	 */
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	/**
	 * @param employeeDesignation
	 *            the employeeDesignation to set
	 */
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	/**
	 * @return the employeeDepartment
	 */
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	/**
	 * @param employeeDepartment
	 *            the employeeDepartment to set
	 */
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

}
