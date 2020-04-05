package com.alicoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AmazonQuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] checker = new int[] { 14};
		
		List<Integer> test;
		
		List<List<Integer>> factors = new ArrayList<>();
		
//		for(int i=0; i<checker.length; i++) {
//			test = getFactors(i);
//			factors.add(test);
//		}
		
//		container.clear();
		
		
		System.out.println(getFactors(669));
//		container.clear();
		System.out.println(getFactors(14));
//		container.clear();
//		System.out.println(getFactors(42));
		

	}
	
	static int j =2;
	static transient int holder;
	static transient List<Integer> container =new ArrayList<>();;
	static Stack<Integer> stack;
	public static synchronized List<Integer> getFactors(int value) {
//		  container = new ArrayList<>();
//		while(true) {
		if(value== 1) {
			container.add(value);
//			stack.push(value);
			return container;
		}
		
		if(value%j == 0) {
			container.add(j);
//			stack.push(j);
			holder = value/j;
			if(holder%j !=0)
			      j++;
			if(holder !=2 && holder%2 !=0 && holder%3 !=0 && holder%5 !=0) {
				
				container.add(holder);
//				stack.push(holder);
				return container;
				
			}
			else
			getFactors(holder);
//				value = holder;
		}
		
		else {
			++j;
			value=holder;
			getFactors(value);
			
		}
//		if(holder ==1) break;
//		}
		
//		if(holder > 1) getFactors(holder);
					  
		
		return container;
	}

}
