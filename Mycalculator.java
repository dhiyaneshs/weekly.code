package assignment;

import week1.day2.Calculator;

public class 	Mycalculator {
	public static void main(String[] args) {
		
		Calculator math = new Calculator();
		System.out.println();
		math.add(15, 10);
		math.sub(65,55.5f);
		math.mul(445.36d, 2, 3);
		math.divi(55454l, 4d, 2f);
	}
	

}
