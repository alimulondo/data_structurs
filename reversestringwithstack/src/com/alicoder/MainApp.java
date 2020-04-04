package com.alicoder;

public class MainApp {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		char[] content = new char[] {'a','s','s','a','l','a','m', 'a', 'l', 'i', 'a', 'k', 'u', 'm'};
		String reverse ="";
		
		
		CustomeStack stack = new CustomeStack(content.length);
		
		for(int i=0; i< content.length; i++)
			stack.push(content[i]);
		
		while(!stack.isEmpty())
			reverse +=stack.pop();
		
		System.out.println(reverse);
	}

}
