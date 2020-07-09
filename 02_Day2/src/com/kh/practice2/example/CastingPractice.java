package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {// class Start
	
	public void method1() {// method1 Start
		// 문자를 입력받아 그 문자와 그 문자의 유니코드 값을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch + " Unicode : " + (int)ch);
	}// method1 End
	
	public void method2() {// method2 Start
		// 실수형으로 국어, 영어, 수학 세과목의 점수를 입력받아 총점과 평균을 출력
		// 이때, 총점과 평균은 정수형으로 처리
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int total = (int)(kor + eng + math);
		int avg = total / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}// method2 End
}// class End












