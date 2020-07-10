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

}// class End
