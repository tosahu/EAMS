package sks.spring.boot.app.eams.model;

public class Address {

	public String address1;
	public String address2;
	public String location;
	public String landMark;
	public String city;
	public String state;
	public String pincode;
	
	public Address() {
		
	}
	
	public Address(String address1, String address2, String location, String landMark, String city, String state,
			String pincode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.location = location;
		this.landMark = landMark;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	
	
	

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
