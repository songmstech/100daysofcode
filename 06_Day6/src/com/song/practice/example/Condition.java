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
	
	public void method3() {// method3 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		if(id.equals("boram")) {
			
			if(pwd.equals("1234")) {
				
				System.out.println("로그인 성공");
				
			}else {
				
				System.out.println("비밀번호가 틀렸습니다.");
				
			}
			
		}else {
			
			System.out.println("아이디가 틀렸습니다.");
			
		}
		
	}// method3 End
	
	public void method4() {// method4 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		
		switch(sc.nextLine()) {
		case "관리자" : System.out.println("회원 관리, 게시글 관리");
		case "회원"  : System.out.println("게시글 작성, 게시글 조회");
		case "비회원" : System.out.println("게시글 조회"); break;
		default : System.out.println("잘못 입력했습니다.");
		}
		
	}// method4 End
	
	public void method5() {// method5 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int midS = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int endS = sc.nextInt();
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();
		
		System.out.println("========== 결과 ==========");
		
		double midG = midS * 0.2;
		double endG = endS * 0.3;
		double taskG = task * 0.3;
		double attendG = attend;
		double total = midG + endG + taskG + attendG;
		
		if(attendG >= 20 * 0.7 && total >= 70) {// 출석 / 총점수 
			
			System.out.println("중간 고사 점수(20) : " + midG);
			System.out.println("기말 고사 점수(30) : " + endG);
			System.out.println("과제 점수       (30) : " + taskG);
			System.out.println("출석 점수       (20) : " + attendG);
			System.out.println("총점 : " + total);
			System.out.println("pass");
			
		}else {
			
			if(attendG <= 20 * 0.7) {
				System.out.println("FAIL [출석 횟수 부족] " + "(" + attend + "/20)" );
			}
			
			if(total <= 70) {
				System.out.println("FAIL [점수 미달] " + "(총점 " + total + ")" );
			}
			
		}
		
	}// method5 End
	
	public void method6() {// method6 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.합격/불합격");
		System.out.println("2.계절");
		System.out.println("3.로그인");
		System.out.println("4.권한확인");
		System.out.println("5.Pass/Fail");
		
		System.out.print("선택 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : method1(); break;
		case 2 : method2(); break;
		case 3 : method3(); break;
		case 4 : method4(); break;
		case 5 : method5(); break;
		default : System.out.println("잘못 입력했습니다."); 
		}
	}// method6 End
	
}// class End














