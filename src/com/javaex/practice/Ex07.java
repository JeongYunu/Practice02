package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		int b = 0;
		int s = 0;
		
		if(num01>=num02) { 
			b = num01;
			s = num02;
		}else {
			b = num02;
			s = num01;
		}
		System.out.println("몫: " + b/s);
		System.out.println("나머지: " + b%s);
		
		sc.close();
	}

}
