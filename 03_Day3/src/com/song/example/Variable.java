package com.song.example;

public class Variable {// class Start
	
	public void overflow() {// overflow Start
		
		// byte 자료형 변수 저장가능한 범위 : -128 ~ 127
		byte bNum = 127;
		
		bNum++;
		bNum++;
		
		System.out.println(bNum);
		
		// int형 저장가능 범위 : -21억... ~ 21억...
		
		int num1 = 1000000000;
		int num2 = 2000000000;
		
		//int result = num1 * num2;
		long result = num1 * num2;
		
		System.out.println(result);
		
	}// overflow End
	
	public void printf() {// printf Start
		
		/*
		 * %d : 정수값 들어가는 자리
		 * %c : 문자값 들어가는 자리
		 * %s : 문자열 들어갈 자리
		 * %f : 실수값 들어갈 자리
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.printf("num1 : %d\n", num1);
		System.out.printf("num1 : %d\n", num1, num2);
		
		System.out.printf("num1 : %d\n, num2 : %d\n", num1, num2);
		
		
	}// printf End

}// class End
