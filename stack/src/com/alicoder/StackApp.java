package com.alicoder;

import java.util.Stack;

/*
 * 
 * @Author: Ali Mulondo
 * */

public class StackApp {
	
	private int maxSize;
	private int top =-1;
	private int[] holder;
	
	Stack<String> st;
	
	
	StackApp(int maxsize){
		maxSize = maxsize;
		holder = new int[maxSize];
	}
	
	
	public void push(int value) throws IllegalAccessException {
		
		if(top < maxSize)
		      holder[++top] = value;
		else {
			throw new IllegalAccessException("Stack is now full");
		}
	}
	
	public int pop() throws IllegalAccessException {
		if(top < 0)
			throw new IllegalAccessException("Stack is now Empty");
		
		
		else return holder[top--];
	}
	
	public int peek() throws IllegalAccessException {
		if(!isEmpty())
		return holder[top];
		
		else 
			throw new IllegalAccessException("Nothing in the stack");
	}
	
	public boolean isEmpty() {
		if(top < 0)	
			return true;
		else return false;
	}

}
