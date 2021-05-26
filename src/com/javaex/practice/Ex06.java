package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num01 = sc.nextInt();
		System.out.print("숫자2: ");
		int num02 = sc.nextInt();

		int b = 0;
		int s = 0;
		
		if(num01>=num02) { //같은값은 = 안넣어도 대충잘나오는듯..ㅋㅋ
			b = num01;
			s = num02;
		}else{
			b = num02;
			s = num01;
		}
		System.out.println("큰수: " + b + "     " + "작은수: " + s);
		
		
		sc.close();

	}

}
