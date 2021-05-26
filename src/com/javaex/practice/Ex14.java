package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		int margin = sc.nextInt();
		
		if(margin>8000) {
			double tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(margin-8000);
			System.out.println("소득세는 " + tax + " 입니다.");
		}else if(margin>4000 && margin<=8000) {
			double tax = 1000*0.09 + 3000*0.18 + 0.27*(margin-4000);
			System.out.println("소득세는 " + tax + " 입니다.");
		}else if(margin>1000 && margin<=4000) {
			double tax = 1000*0.09 + 0.18*(margin-1000);
			System.out.println("소득세는 " + tax + " 입니다.");
		}else if(margin>0 && margin<=1000) {
			double tax = 0.09*margin;
			System.out.println("소득세는 " + tax + " 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
	}

}
