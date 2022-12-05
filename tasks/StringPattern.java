package com.xworkx.programs;

public class StringPattern {
	public static void main(String [] args) {
		//revers string 
		String name ="Java Programing";
		System.out.println(name);
		//in bulit 
		for(int i=0; i<name.length();i++ ) {
			System.out.print(" "+name.charAt(i));
		}
		  System.out.println("String reverse");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(" "+name.charAt(i));
		}
		//counting a given char
		int count=0;
		int count1=0;
		int count2=0;
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count+=1;
			}else {
				count1+=1;
			}
		}
		System.out.println("count"+count);
		System.out.println("count1:"+count1);
		
		String str="Good learning";
		for(char ch:str.toCharArray()) {
			if (ch=='o') {
				count2+=1;
			}
			System.out.print(ch);
		}
		System.out.println("count2:"+count2);
		
		String names ="madam";
		String reverse="";
		for(int i=names.length()-1;i>=0;i--) {
			
			reverse+=names.charAt(i);
		}
		if (names.equals(reverse)) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
		}
	}

}
