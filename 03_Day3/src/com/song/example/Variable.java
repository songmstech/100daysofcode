package com.song.example;

public class Variable {// class Start
	
	public void overflow() {// overflow Start
		
		// byte �ڷ��� ���� ���尡���� ���� : -128 ~ 127
		byte bNum = 127;
		
		bNum++;
		bNum++;
		
		System.out.println(bNum);
		
		// int�� ���尡�� ���� : -21��... ~ 21��...
		
		int num1 = 1000000000;
		int num2 = 2000000000;
		
		//int result = num1 * num2;
		long result = num1 * num2;
		
		System.out.println(result);
		
	}// overflow End

}// class End
