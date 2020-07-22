package com.song.view;

import java.util.Scanner;

import com.song.controller.PersonController;
import com.song.model.vo.Person;

public class PersonView {
	
	private Scanner sc = new Scanner(System.in);
	
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
	
		while(true) {
			
			System.out.println("\n==== 메인 메뉴 ====");
			System.out.println("1.회원추가");
			System.out.println("2.회원 전체 조회");
			System.out.println("3.회원 이름 검색");
			System.out.println("4.회원 평균 재산 조회");
			System.out.println("9.프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertPerson(); break;
			case 2 : printPerson(); break;
			case 3 : searchPerson(); break;
			case 4 : avgWealth(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못입력했습니다. 다시 입력해주세요."); 
			}
			
		}
	}
	
	public void insertPerson() {
		
		System.out.println("\n==== 회원 정보 입력 ====");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("재산 : ");
		int wealth = sc.nextInt();
		
		int result = pc.insertPerson(name, age, wealth);
			
		if(result == 1) {
			System.out.println("회원 추가 성공");
		}else {
			System.out.println("회원 추가 실패");
		}
		
		//Person p = new Person(name, age, wealth);
		//System.out.println(p);
		
	}
	
	public void printPerson() {
		
		System.out.println("\n==== 회원 정보 조회 ====");
		
		int count = pc.selectCount();
		
		if(count == 0) {
			
			System.out.println("현재 추가된 회원이 없습니다. ");
			
		}else {
			
			Person[] p = pc.selectPerson();
			
			for(int i = 0; i < count; i++) {
				
				System.out.println(p[i].toString());
				
			}
			
		}
	}
	
	public void searchPerson() {
		
		System.out.println("\n==== 회원 검색 ====");
		
		System.out.print("검색할 이름 : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search);
		
		if(searchPerson == null) {
			
			System.out.println("회원 정보를 찾을 수 없습니다.");
			
		}else {
			
			System.out.println(searchPerson.toString());
			
		}
		
	}
	
	public void avgWealth() {
		
		System.out.println("\n==== 회원 평균 재산 조회 ====");
		
		int count = pc.selectCount();
		
		if(count == 0) {
			
			System.out.println("추가된 회원이 없습니다.");
			
		}else {
			
			System.out.println(pc.avgWealth());
			
		}
		
	}

}













