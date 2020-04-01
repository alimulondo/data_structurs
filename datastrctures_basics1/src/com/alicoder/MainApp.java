package com.alicoder;

import java.time.LocalTime;

/*
 * int secondSmallest(int[] x)
 * Returns second smallest element in array x. If x has fewer than 2 elements returns 0.
 * This is implementation of returning the second
 * smallest number from an unorderd array without sorting
 * assuming all numbers are non negative.
 * time complexity is O(n)
 * This question was asked by Goldman sachs. 
 * Author: Ali Mulondo
 * 
 * */

public class MainApp {

	private static int checker;

	public static void main(String[] args) {
		
		int[] test = new int[] {7,4,6,2, 1, 3, 8, 9};
		
		// TODO Auto-generated method stub
		
		System.out.println(secondSmallest(test));
		
}
	
	public static int secondSmallest(int[] x) {
		
		if(x.length< 2) return 0;
		
		int temp =0;
		int smallest= 0;
		int secondsmallest = 0;
		   temp =x[0];
		for(int i=1; i<x.length; i++) {
			
			if(temp>x[i]) {
				temp = x[i];
				checker = i;
				smallest= temp;
				
			}
			
		}
		
		temp = x[0];
		if(smallest ==0 ) smallest = smallest + 1;
		x[checker]= smallest<<6;
     for(int i=1; i<x.length; i++) {
			
			if(temp>x[i]) {
				temp = x[i];
				 secondsmallest= temp;
				
			}
			
		}
     if(smallest ==0 ) smallest = smallest -1;
     x[checker]= smallest >> 6;
				
     
		return secondsmallest;
	}
	
}

