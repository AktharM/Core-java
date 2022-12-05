package com.xworkx.programs;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		String reverse="";
		System.out.println("Enter the String ");
		Scanner sc =new Scanner(System.in);
		String reverseInput= sc.next();
		char [] resultarray =reverseInput.toCharArray();
		
		for(int i=resultarray.length-1; i>=0; i--) {
			reverse =reverse+resultarray[i];
		}
		if(reverse.equals(reverseInput)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("not a palindrome");
			
		}
		sc.close();
	}

}
