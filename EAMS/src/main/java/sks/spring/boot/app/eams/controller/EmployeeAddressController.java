package sks.spring.boot.app.eams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sks.spring.boot.app.eams.model.EmployeeAddress;
import sks.spring.boot.app.eams.service.EmployeeAddressService;

@RestController
@RequestMapping(value = "/employee/address")
public class EmployeeAddressController {

	@Autowired
	private EmployeeAddressService empAddrService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Object> addEmployeeAddress(@RequestBody EmployeeAddress empAddress) {

		empAddrService.addEmployeeAddress(empAddress);
		return new ResponseEntity<>("Employee Address Added Successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/modify/{empId}", method = RequestMethod.PUT)
	public ResponseEntity<Object> modifyEmployeeAddress(@PathVariable String empId,
			@RequestBody EmployeeAddress empAddress) {

		empAddrService.updateEmployeeAddress(empAddress);

		return new ResponseEntity<>("Employee Address Modified Successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{empId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteEmployeeAddress(@PathVariable String empId) {

		empAddrService.removeEmployeeAddress(empId);

		return new ResponseEntity<>("Employee Address Deleted Successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/{empId}", method = RequestMethod.GET)
	public ResponseEntity<Object> getEmployeeAddress(@PathVariable String empId) {
		EmployeeAddress emp = empAddrService.getEmployeeAddress(empId);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<Object> getAllEmployeeAddress() {
		List<EmployeeAddress> emp = empAddrService.getAllEmployeeAddress();
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}

	
}

