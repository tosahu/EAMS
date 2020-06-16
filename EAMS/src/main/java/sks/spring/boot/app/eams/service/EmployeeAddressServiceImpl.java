package sks.spring.boot.app.eams.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import sks.spring.boot.app.eams.model.Address;
import sks.spring.boot.app.eams.model.EmployeeAddress;

@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService{
	
static HashMap<String,Address> employeeAddressMap= new HashMap<>();
	
	static {
		
		
		Address emp1Addr = new Address("S Block","","PandavNagar","","Delhi","Delhi","110092");
		employeeAddressMap.put("1001", emp1Addr);
		
	
		Address emp2Addr = new Address("B Block","","PandavNagar","","Delhi","Delhi","110092");
		employeeAddressMap.put("1002", emp2Addr);
		
			
		
	}
	

	EmployeeAddressServiceImpl(){
		
		System.out.println("Instance Created : " + this.getClass().getName());
	}


	@Override
	public void addEmployeeAddress(EmployeeAddress empAddress) {
		// TODO Auto-generated method stub
		employeeAddressMap.put(empAddress.getEmpId(), empAddress.getAddress());
	}


	@Override
	public void removeEmployeeAddress(String empId) {
		// TODO Auto-generated method stub
		employeeAddressMap.put(empId, null);
	}


	@Override
	public EmployeeAddress getEmployeeAddress(String empId) {
		EmployeeAddress empAddress = new EmployeeAddress();
		empAddress.setEmpId(empId);
		empAddress.setAddress(employeeAddressMap.get(empId));
		return empAddress;
	}


	@Override
	public void updateEmployeeAddress(EmployeeAddress empAddress) {
		Address addr = employeeAddressMap.get(empAddress.getEmpId());
		addr.setAddress1(empAddress.getAddress().getAddress1());
		addr.setAddress2(empAddress.getAddress().getAddress2());
		addr.setCity(empAddress.getAddress().getCity());
		addr.setLandMark(empAddress.getAddress().getLandMark());
		addr.setLocation(empAddress.getAddress().getLocation());
		addr.setState(empAddress.getAddress().getState());
		addr.setPincode(empAddress.getAddress().getPincode());
	}


	@Override
	public List<EmployeeAddress> getAllEmployeeAddress() {
		List<EmployeeAddress> empAddrList = new ArrayList<EmployeeAddress>();
		Set<String> empIdSet =  employeeAddressMap.keySet();
		
		for(String empId : empIdSet) {
			
			empAddrList.add(getEmployeeAddress(empId));
			
		}
		
		
		return empAddrList;
	}



	
}
