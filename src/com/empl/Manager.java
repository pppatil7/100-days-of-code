package com.empl;

public class Manager extends Emp {
	double petrolal;
	double foodal;
	double otheral;

	public Manager(int id, String name, double bsalary) {
		super(id, name, bsalary);
		petrolal = 0.08 * bsalary;
		foodal = 0.13 * bsalary;
		otheral = 0.03 * bsalary;
	}

	@Override
	

	public double calsal() {
		return super.calsal()+petrolal+foodal+otheral;

	}

	@Override
	public String toString() {
		return "Manager [petrolal=" + petrolal + ", foodal=" + foodal + ", otheral=" + otheral + "]";
	}

	

}
