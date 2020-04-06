package com.alicoder;

/*
 *This program checks the delimiters in a line of text typed by the
*user.\
*Example check if this line of text is correctly formatted a{b(c[d]e)f}
 * @Author Ali Mulondo
 * */

public class MainApp {
	
	public static void main(String...args) throws IllegalAccessException {
		String text = "a{b(c[d}e)f}";
		CustomeStack stack = new CustomeStack(text.length());
		 int counter =0;
		while(counter<text.length()) {
			char ch = text.charAt(counter);
			switch(ch) {
			case '{':
			case '(':
			case '[':
				stack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!stack.isEmpty()) {
					char chx = stack.pop();
					if(ch == '}' && chx !='{'
							|| ch =='[' && chx !=']'
							|| ch =='(' && chx !=')') {
						System.out.println(chx +" can not be closed with "+ ch + " at index "+ counter);
					}
					else System.out.println("The text is fine ma shaa Allah");
				}
			}
			
			
			counter++;
		}
		
	while(!stack.isEmpty())
		System.out.println(stack.pop());
		
	}

}
