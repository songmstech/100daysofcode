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
		// �Է¹��� ���� ������� �ƴ��� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0? "��� �Դϴ�." : "����� �ƴմϴ�.");
	}// method2 End
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ �Է�(+or-) : ");
		char op = sc.nextLine().charAt(0);
		
		System.out.println((op == '+')? (num1 + num2) : (op == '-')? (num1 - num2) : "�߸��Է��߽��ϴ�.");
	}
	
	public void method4() {// method4 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		int per = candy / people;
		int re = candy % people;
		
		System.out.println("1�δ� ���� ���� : " + per);
		System.out.println("���� ���� ���� : " + re);
		
	}// method4 End
	
	public void method5() {// method5 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;
		
		System.out.println("�հ� : " + total);
		System.out.println("��� : " + avg);
		
		System.out.println((kor < 40 || eng < 40 || math < 40)? "���հ�" : (avg >= 60)? "�հ�" : "���հ�");
	}// method5 Start
	
	public void method6() {// method6 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ���� ): ");
		String num = sc.nextLine();
		
		System.out.println(num.charAt(7) == '2'? "����" : "����");
		
	}// method6 End
	
	public void method7() {// method7 Start
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int sal1 = sc.nextInt();
		System.out.print("B����� ���� : ");
		int sal2 = sc.nextInt();
		System.out.print("C����� ���� : ");
		int sal3 = sc.nextInt();
		
		double salA = (sal1 + (sal1 * 0.4));
		double salB = sal2;
		double salC = (sal3 + (sal3 * 0.15));
		
		System.out.println("A����� �μ�Ƽ������ ���� : " + salA);
		System.out.println(salA >= 3000? "3000 �̻�" : "3000 �̸�");
		System.out.println("B����� �μ�Ƽ������ ���� : " + salB);
		System.out.println(salB >= 3000? "3000 �̻�" : "3000 �̸�");
		System.out.println("C����� �μ�Ƽ������ ���� : " + salC);
		System.out.println(salC >= 3000? "3000 �̻�" : "3000 �̸�");
		
	}// method8 End
}// class End




















