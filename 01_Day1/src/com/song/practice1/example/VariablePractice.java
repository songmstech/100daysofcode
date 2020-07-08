package com.song.practice1.example;

import java.util.Scanner;

public class VariablePractice {// class Start
	
	public void method1() { // method1 Start
		// 이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 변수에 담아 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char sex = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키" + height + "인 " + age + "살 " + sex + " " + name + "님 반갑습니다.");
	} // method1 End
	
	public void method2() { // method2 Start
		// 키보드로 정수 두개를 입력받아 두 수의 합, 차, 곱, 나누기한 몫을 구하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과  : " + sub);
		System.out.println("곱하기 결과 : " + multi);
		System.out.println("나누기 몫 결과 : " + div);
	} // method2 End
	
	public void method3() { // method3 Start
		// 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		double per = (width + height) * 2;
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + per);
	} // method3 End
	
	public void method4() { // method4() Start
		// 영어 문자열값을 입력받아 앞의 문자 세개를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	} // method4() End

}// class End