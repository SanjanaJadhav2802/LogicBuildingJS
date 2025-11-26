package com.Question.Others;

public class FindAllEvenWordsFromString {

	public static void main(String[] args) {
		String s1 = "Hello my name is sanjana ";
	String [] Words = s1.split(" ");
	
	for(String s2 : Words)
	{
		//int length = s2.length();
		if((s2.length() )%2==0)
		{
			System.out.println( s2);
		}
		
	}

	}

}
