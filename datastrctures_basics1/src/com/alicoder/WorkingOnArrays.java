package com.alicoder;

/*
 * 
 * @Author: Ali Mulondo
 * */

public class WorkingOnArrays {
	private  int[] x;
	private  int i;
	
	WorkingOnArrays(){
		i = 0;
	    creatArray();
		
	}
	
	public static void main(String[] args) {
		WorkingOnArrays obj = new WorkingOnArrays();     
		
		    
		obj.inserData(50);
		obj.inserData(5);
		obj.inserData(10);
		obj.inserData(9);
		obj.inserData(5);
		obj.display();
		System.out.println(obj.deleteValue(7));
		System.out.println("After deleting");
		obj.display();
		
	}
	
	
	public  void creatArray() {
		 x = new int[100];
		
	}
	
	// inserting data in an unordered array is O(1)
	public  void inserData(int value) {
		   if(i<100) {
			 
		   x[i] = value;
//		   System.out.println(i);
		   i++;
		   }
		 
	}
	
	public  void display() {
		for(int j=0; j<i; j++) {
			System.out.println(x[j]);
		}
	}
	
	//search an unorderd array am using linear search because the array is not orderd time complexity is O(n)
	
	public boolean findValue(int value) {
		
		for(int j=0; j<i; j++) {
			if(value == x[j]) return true;
		}
		
		return false;
	}
	
	// deleting values in an unordered array. Time complexity is O(n)
	
	public String deleteValue(int value) {
		int j;
		for( j=0; j<i; j++) 
			if(value == x[j]) 
				break;
		if(j == i) return "Not found";	
		
		else {
		for(int k =j; k<i; k++) {
			x[k] = x[k + 1];
		}
		
		return "Successfully deleted.";
		
		}
		
	}

}
