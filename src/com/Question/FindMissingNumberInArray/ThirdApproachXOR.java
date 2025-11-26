package com.Question.FindMissingNumberInArray;

public class ThirdApproachXOR {

	public static void main(String[] args) {
		
		int array[] = { 1, 2, 4, 5, 6 };
		int missingNumber=0;
		
		for(int no:array)
		{
			missingNumber = missingNumber ^  no;
			
		}
		
		for(int i=0;i<=6;i++)
		{
			missingNumber = missingNumber ^ i;
		}
		
		System.out.println("Missing Number is "+missingNumber);

	}

}
