package sks.spring.boot.app.eams.service;

import java.util.List;

import sks.spring.boot.app.eams.model.EmployeeAddress;

public interface EmployeeAddressService {
	
	public void addEmployeeAddress(EmployeeAddress empAddress);

	public void removeEmployeeAddress(String empId);
	public EmployeeAddress getEmployeeAddress(String empId);
	public void updateEmployeeAddress(EmployeeAddress empAddress);

	public List<EmployeeAddress> getAllEmployeeAddress();

}
