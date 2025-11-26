package com.Question.OneSwapNumbers;

public class BitWiseManipulation {

	public static void main(String[] args) {
		
		int a= 10;
		int b=20;
		
		//Using xor operation, complete description available in notebook
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
	

	}

}

