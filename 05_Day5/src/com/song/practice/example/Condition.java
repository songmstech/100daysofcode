package com.song.practice.example;

import java.util.Scanner;

public class Condition {// class Start
	
	public void method1() {// method1 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
				
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				System.out.println("�հ� : " + total);
				System.out.println("��� : " + avg);
				System.out.println("�����մϴ�, �հ��Դϴ�.");

			
		}else {
			
			System.out.println("���հ� �Դϴ�.");
			
		}
		
	}// method1 End
	
	public void method2() {// method2 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12�� ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : 
		case 2 : System.out.println(month + "���� �ܿ��Դϴ�."); break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println(month + "���� ���Դϴ�."); break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println(month + "���� �����Դϴ�."); break;
		case 9 : 
		case 10 : System.out.println(month + "���� �����Դϴ�."); break;
		case 11 : 
		case 12 : System.out.println(month + "���� �ܿ��Դϴ�."); break;
		
		default : System.out.println(month + "���� �߸� �Էµ� ���Դϴ�."); break;
		}
		
	}// method2 End
	
}// class End










