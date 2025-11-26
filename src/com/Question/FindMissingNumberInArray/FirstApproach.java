package com.Question.FindMissingNumberInArray;

public class FirstApproach {

	public static void main(String[] args) {
		int array[]= {1,2,4,5,6};
		//int n = 6;
		//instead of using hardcode value
		
		int lastIndex =array.length-1;
		int n = array[lastIndex];
		
		int arraySum=0;
		//find total sum
		int totalSum = n *(n+1)/2;
		System.out.println(totalSum);
		
		//ArraySum
		for(int i=0;i<=(array.length)-1;i++)
		{
			arraySum = arraySum + array[i];
		}

		System.out.println(arraySum);
		
		System.out.println("Missing number in array is "+ (totalSum-arraySum));
	}

}
