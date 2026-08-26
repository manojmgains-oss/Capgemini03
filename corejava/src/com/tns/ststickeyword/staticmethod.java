package com.tns.ststickeyword;

public class staticmethod {
	static int calculateBonus(int Salary) {
		return Salary*10/100;
	}
	public static void main(String[] args) {
		int Bonus=staticmethod.calculateBonus(30000);
		System.out.println("Bonus :"+Bonus);
	}

}
