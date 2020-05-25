package com.abc.spring.pojo;

public class Person {

	private String fullname;
	private String email;
	private long phn;
	private String occupation;
	private Address homeAddress;
	private Address workAddress;

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", email=" + email + ", phn=" + phn + ", occupation=" + occupation
				+ ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
	}

	
	

}
