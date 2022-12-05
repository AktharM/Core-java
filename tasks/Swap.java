package com.xworkx.programs;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		System.out.println("Enter the valve ");
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
