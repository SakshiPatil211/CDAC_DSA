package com.demo.test;
import com.demo.stack.MyStackListGeneric;

public class CheckBalancedParenthesis {
	
	public static boolean checkParenthesis(String str1) {
		MyStackListGeneric<Character> st = new MyStackListGeneric<>();
		for(int i=0;i<str1.length();i++) {
			Character ch = str1.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}else {
				if(str1.isEmpty()) {
					return false;
				}else {
					Character ch2 = st.pop();
					switch(ch2) {
						case ']'->{
							if(ch2!='[') {
								return false;
							}
						}
						
						case ')'->{
							if(ch2!=')') {
								return false;
							}
						}
						
						case '}'->{
							if(ch2!='{') {
								return false;
							}
						}
					}
				}
			}
		}
		return st.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String str1 = "{{[](){[]}}}";
		String str2="{{}[{]}}";
		String str3="({[][]({{}})}";
		
		boolean status = checkParenthesis(str3);
		if(status) {
			System.out.println("balanced");
		}else {
			System.out.println("unbalanced");
		}
	}

	

}
