package com.Question.FindMissingNumberInArray;

public class SecondApproach {

	public static void main(String[] args) {

		int array[] = { 1, 2, 4, 5, 6 };
		int sum=0;

		// will add number sequentially and find out missing number

		for (int i = 0; i < array.length; i++) {
			
			
        sum = sum +1;
        if(sum!=array[i])
        {
	     System.out.println("Missing Number is "+sum );
	     break;
        }
		}

	}

}
