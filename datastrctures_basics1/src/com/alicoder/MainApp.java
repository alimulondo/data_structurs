package com.alicoder;

/*
 * int secondSmallest(int[] x)
 * Returns second smallest element in array x. If x has fewer than 2 elements returns 0.
 * This is implementation of returning the second
 * smallest number from an unorderd array without sorting
 * assuming all numbers are non negative.
 * time complexity is O(n)
 * This question was asked by Goldman sachs. 
 * @Author: Ali Mulondo
 * 
 * */

public class MainApp {

	public static void main(String[] args) {
		
		int[] test = new int[] {7,4,6,2, 3, 8, 9};
		
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
				smallest= temp;
				
			}
			
		}
		
		 int[] holder = deleteSmallest(x, smallest);
		
		temp = holder[0];
		
     for(int i=1; i<holder.length; i++) {
			
			if(temp>holder[i]) {
				temp = holder[i];
				 secondsmallest= temp;
				
			}
			
		}
    				
     
		return secondsmallest;
	}
	
	public static int[] deleteSmallest(int[] x, int smallest) {
		  int[] holder = new int[x.length-1];
		  int i;
		  for( i=0; i<x.length; i++) {
			  
			  if(smallest==x[i]) break;
			  
		  }
		  
		  for(int j=i; j<x.length-1; j++) {
			  x[j] =x[j+1];
		  }
		 		 
		  for(int k=0; k<x.length-1; k++) {
			  holder[k] = x[k];
			 
		  }
		  
		  return holder;
		
	}
	
}

