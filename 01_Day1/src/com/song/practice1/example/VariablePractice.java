package com.song.practice1.example;

import java.util.Scanner;

public class VariablePractice {// class Start
	
	public void method1() { // method1 Start
		// �̸�, ����, ����, Ű�� ����ڿ��� �Է¹޾� ������ ������ ��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char sex = sc.nextLine().charAt(0);
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű" + height + "�� " + age + "�� " + sex + " " + name + "�� �ݰ����ϴ�.");
	} // method1 End
	
	public void method2() { // method2 Start
		// Ű����� ���� �ΰ��� �Է¹޾� �� ���� ��, ��, ��, �������� ���� ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("���ϱ� ��� : " + sum);
		System.out.println("���� ���  : " + sub);
		System.out.println("���ϱ� ��� : " + multi);
		System.out.println("������ �� ��� : " + div);
	} // method2 End
	
	public void method3() { // method3 Start
		// ����, ���� ���� �Ǽ������� �Է¹޾� �簢���� ������ �ѷ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		
		System.out.print("���� : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		double per = (width + height) * 2;
		
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + per);
	} // method3 End
	
	public void method4() { // method4() Start
		// ���� ���ڿ����� �Է¹޾� ���� ���� ������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
	} // method4() End

}// class End