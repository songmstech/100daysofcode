package com.song.operator.practice;

import java.util.Scanner;

public class Operator {// class Start
	
	public void method1() {// method1 Start
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);
		System.out.println((++a) + (b++));
		System.out.println((a++) + (--b) +(--c));
		
	}// method1 End
	
	public void method2() {// method2 Start
		// 입력받은 값이 양수인지 아닌지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0? "양수 입니다." : "양수가 아닙니다.");
	}// method2 End
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자 입력(+or-) : ");
		char op = sc.nextLine().charAt(0);
		
		System.out.println((op == '+')? (num1 + num2) : (op == '-')? (num1 - num2) : "잘못입력했습니다.");
	}
	
	public void method4() {// method4 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		int per = candy / people;
		int re = candy % people;
		
		System.out.println("1인당 사탕 개수 : " + per);
		System.out.println("남는 사탕 개수 : " + re);
		
	}// method4 End
	
	public void method5() {// method5 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		
		System.out.println((kor < 40 || eng < 40 || math < 40)? "불합격" : (avg >= 60)? "합격" : "불합격");
	}// method5 Start
	
	public void method6() {// method6 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함 ): ");
		String num = sc.nextLine();
		
		System.out.println(num.charAt(7) == '2'? "여자" : "남자");
		
	}// method6 End
	
	public void method7() {// method7 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int sal1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int sal2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int sal3 = sc.nextInt();
		
		double salA = (sal1 + (sal1 * 0.4));
		double salB = sal2;
		double salC = (sal3 + (sal3 * 0.15));
		
		System.out.println("A사원의 인센티브포함 연봉 : " + salA);
		System.out.println(salA >= 3000? "3000 이상" : "3000 미만");
		System.out.println("B사원의 인센티브포함 연봉 : " + salB);
		System.out.println(salB >= 3000? "3000 이상" : "3000 미만");
		System.out.println("C사원의 인센티브포함 연봉 : " + salC);
		System.out.println(salC >= 3000? "3000 이상" : "3000 미만");
		
	}// method8 End
}// class End




















