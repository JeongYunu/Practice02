package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		if(num>0) {
			double p = 7*num+2;
			System.out.println("계산결과는 " + p + " 입니다.");
		}else {
			double m = num*num*num - 9*num + 2;
			System.out.println("계산결과는 " + m + " 입니다.");
		}
		
		sc.close();

	}

}
