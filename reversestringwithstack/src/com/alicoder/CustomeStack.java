package com.alicoder;

public class CustomeStack{
	
	private int maxSize;
	private int top =-1;
	private char[] holder;
	
	
	CustomeStack(int max){
		maxSize = max;
		holder = new char[maxSize];
		
	}
	
	public void push(char value) throws IllegalAccessException{
		
		if(top == maxSize)
			  throw new IllegalAccessException("Stack is full");
		else
			holder[++top] = value;
		
	}
	
	public char pop() throws IllegalAccessException{
		if(top < 0)
			throw new IllegalAccessException("Stack empty");
		else
			return holder[top--];
	}
	
	public char peek() throws IllegalAccessException{
		if(top < 0)
			throw new IllegalAccessException("Stack is Empty");
		else 
			return holder[top];
	}
	
	public boolean isEmpty() {
		if(top < 0)
			return true;
		else 
			return false;
	}

}
