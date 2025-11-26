package com.Question.TwoReverseNumber;

public class ReverseNumber {

	public static void main(String[] args) {
		int Number = 210;
		int ReverseNumber=0;
		int LastDigitNumber;
		
		while(Number !=0)
		{
			LastDigitNumber = Number %10;
			ReverseNumber = ReverseNumber * 10 + LastDigitNumber;
			Number = Number /10;
			
		}
		
		System.out.print(ReverseNumber);
		
	

	}

}
