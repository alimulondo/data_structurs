package com.alicoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AmazonQuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] checker = new int[] {42, 56, 14};
			
		List<Integer> test;
		List<Integer> merge = new ArrayList<>();
		
		List<List<Integer>> factors = new ArrayList<>();
		
		for(int i=0; i<checker.length; i++) {
			test = getFactors(checker[i]);
			factors.add(test);
		} 
		
				
		 for(List<Integer> cont:factors) {
			 
			   merge.addAll(cont);						 
		 }
		 
		 merge = merge.stream()
				  .sorted()
				  .collect(Collectors.toList());
		 
		 List<Integer> commonMul = merge.stream()
				 		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				 		.entrySet()
				 		.stream()
				 		.filter( i -> i.getValue()== checker.length)
				 		.map(Map.Entry::getKey)
				 		.collect(Collectors.toList());
		 
		 // get the greatest common denominator
		 int denominator =Collections.max(commonMul);
		
		 System.out.println(denominator);
		 	}
	
	static int j =2;
	static transient int holder;
	
	// returns factor of a given number.
	public static  List<Integer> getFactors(int value) {
		 List<Integer> container =new ArrayList<>();
		 
		 if(value%2 !=0 && value%3 !=0 && value%5 !=0) {
			 container.add(1);
			 container.add(value);
		 }
		 
		 else {
			 container.add(value);
			 container.add(1);
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
