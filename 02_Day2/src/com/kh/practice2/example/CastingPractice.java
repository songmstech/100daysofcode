package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {// class Start
	
	public void method1() {// method1 Start
		// ���ڸ� �Է¹޾� �� ���ڿ� �� ������ �����ڵ� ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch + " Unicode : " + (int)ch);
	}// method1 End
	
	public void method2() {// method2 Start
		// �Ǽ������� ����, ����, ���� �������� ������ �Է¹޾� ������ ����� ���
		// �̶�, ������ ����� ���������� ó��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
		int total = (int)(kor + eng + math);
		int avg = total / 3;
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}// method2 End
}// class End












