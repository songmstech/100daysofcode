package com.song.practice.example;

import java.util.Scanner;

public class Condition {// class Start
	
	public void method1() {// method1 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
				
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("합계 : " + total);
				System.out.println("평균 : " + avg);
				System.out.println("축하합니다, 합격입니다.");

			
		}else {
			
			System.out.println("불합격 입니다.");
			
		}
		
	}// method1 End
	
	public void method2() {// method2 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12월 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : 
		case 2 : System.out.println(month + "월은 겨울입니다."); break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println(month + "월은 봄입니다."); break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println(month + "월은 여름입니다."); break;
		case 9 : 
		case 10 : System.out.println(month + "월은 가을입니다."); break;
		case 11 : 
		case 12 : System.out.println(month + "월은 겨울입니다."); break;
		
		default : System.out.println(month + "월은 잘못 입력된 달입니다."); break;
		}
		
	}// method2 End
	
}// class End










