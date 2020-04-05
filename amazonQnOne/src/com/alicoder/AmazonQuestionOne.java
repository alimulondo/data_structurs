package com.alicoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AmazonQuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] checker = new int[] {42, 56, 14, 36};
		
		List<Integer> test;
		
		List<List<Integer>> factors = new ArrayList<>();
		
		for(int i=0; i<checker.length; i++) {
			test = getFactors(checker[i]);
			factors.add(test);
		}
		
		
		
		
		System.out.println(factors);
		
		 for(List<Integer> cont:factors) {
			 
			 
		 }
		

				

	}
	
	static int j =2;
	static transient int holder;
	
	
	public static  List<Integer> getFactors(int value) {
		 List<Integer> container =new ArrayList<>();
		 
		 if(value%2 !=0 && value%3 !=0 && value%5 !=0) {
			 container.add(1);
			 container.add(value);
		 }
		 
		 else {
		 for(int i=2; i<=Math.sqrt(value); i++) {
			  if(value%i ==0) {
				  				
				 container.add(i);
				 if(value/i != Math.sqrt(value))
				 container.add(value/i);
				 
			  }
		 }
		 }
		
					  
		
		return container;
	}

}
