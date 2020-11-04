package com.empl;

public class Market extends Emp {

	double kilometer;
	double toural;
	double telal=1500;
	double totalsal;
	
	public Market(int id,String name,double bsalary,double kilometer) {
		super(id,name,bsalary);
		this.kilometer=kilometer;
	}
	
	public String toString() {
		return super.toString();
	}
	
	public double calsal() {
		super.calsal();
		toural=kilometer*5;
		totalsal=bsalary+toural+telal;
		return totalsal;
	}
}
