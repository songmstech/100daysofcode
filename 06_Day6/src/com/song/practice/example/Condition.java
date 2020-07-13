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
	
	public void method3() {// method3 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pwd = sc.nextLine();
		
		if(id.equals("boram")) {
			
			if(pwd.equals("1234")) {
				
				System.out.println("�α��� ����");
				
			}else {
				
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				
			}
			
		}else {
			
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			
		}
		
	}// method3 End
	
	public void method4() {// method4 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		
		switch(sc.nextLine()) {
		case "������" : System.out.println("ȸ�� ����, �Խñ� ����");
		case "ȸ��"  : System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ");
		case "��ȸ��" : System.out.println("�Խñ� ��ȸ"); break;
		default : System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
	}// method4 End
	
	public void method5() {// method5 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int midS = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int endS = sc.nextInt();
		System.out.print("���� ���� : ");
		int task = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int attend = sc.nextInt();
		
		System.out.println("========== ��� ==========");
		
		double midG = midS * 0.2;
		double endG = endS * 0.3;
		double taskG = task * 0.3;
		double attendG = attend;
		double total = midG + endG + taskG + attendG;
		
		if(attendG >= 20 * 0.7 && total >= 70) {// �⼮ / ������ 
			
			System.out.println("�߰� ��� ����(20) : " + midG);
			System.out.println("�⸻ ��� ����(30) : " + endG);
			System.out.println("���� ����       (30) : " + taskG);
			System.out.println("�⼮ ����       (20) : " + attendG);
			System.out.println("���� : " + total);
			System.out.println("pass");
			
		}else {
			
			if(attendG <= 20 * 0.7) {
				System.out.println("FAIL [�⼮ Ƚ�� ����] " + "(" + attend + "/20)" );
			}
			
			if(total <= 70) {
				System.out.println("FAIL [���� �̴�] " + "(���� " + total + ")" );
			}
			
		}
		
	}// method5 End
	
	public void method6() {// method6 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.�հ�/���հ�");
		System.out.println("2.����");
		System.out.println("3.�α���");
		System.out.println("4.����Ȯ��");
		System.out.println("5.Pass/Fail");
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : method1(); break;
		case 2 : method2(); break;
		case 3 : method3(); break;
		case 4 : method4(); break;
		case 5 : method5(); break;
		default : System.out.println("�߸� �Է��߽��ϴ�."); 
		}
	}// method6 End
	
}// class End














