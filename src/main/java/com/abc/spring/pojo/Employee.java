package com.abc.spring.pojo;

public class Employee {

	private String fname;
	private Integer phnno;
	private String email;

	public Employee(String fname, Integer phnno, String email) {
		super();
		this.fname = fname;
		this.phnno = phnno;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", phnno=" + phnno + ", email=" + email + "]";
	}
	

}
