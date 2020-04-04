package com.alicoder;

/*
 * 
 * @Author: Ali Mulondo
 * */

public class MainApp {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		
		StackApp stack = new StackApp(10);
		
		
		
		stack.push(50);
		stack.push(70);
		stack.push(30);
		stack.push(10);
		stack.push(20);
		stack.push(80);
		
		while(!stack.isEmpty())
			System.out.println("value is: "+ stack.pop());
		
		
		

	}

}
