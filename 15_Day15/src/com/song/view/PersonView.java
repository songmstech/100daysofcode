package com.song.view;

import java.util.Scanner;

import com.song.controller.PersonController;
import com.song.model.vo.Person;

public class PersonView {
	
	private Scanner sc = new Scanner(System.in);
	
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
	
		while(true) {
			
			System.out.println("\n==== ���� �޴� ====");
			System.out.println("1.ȸ���߰�");
			System.out.println("2.ȸ�� ��ü ��ȸ");
			System.out.println("3.ȸ�� �̸� �˻�");
			System.out.println("4.ȸ�� ��� ��� ��ȸ");
			System.out.println("9.���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertPerson(); break;
			case 2 : printPerson(); break;
			case 3 : searchPerson(); break;
			case 4 : avgWealth(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���."); 
			}
			
		}
	}
	
	public void insertPerson() {
		
		System.out.println("\n==== ȸ�� ���� �Է� ====");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("��� : ");
		int wealth = sc.nextInt();
		
		int result = pc.insertPerson(name, age, wealth);
			
		if(result == 1) {
			System.out.println("ȸ�� �߰� ����");
		}else {
			System.out.println("ȸ�� �߰� ����");
		}
		
		//Person p = new Person(name, age, wealth);
		//System.out.println(p);
		
	}
	
	public void printPerson() {
		
		System.out.println("\n==== ȸ�� ���� ��ȸ ====");
		
		int count = pc.selectCount();
		
		if(count == 0) {
			
			System.out.println("���� �߰��� ȸ���� �����ϴ�. ");
			
		}else {
			
			Person[] p = pc.selectPerson();
			
			for(int i = 0; i < count; i++) {
				
				System.out.println(p[i].toString());
				
			}
			
		}
	}
	
	public void searchPerson() {
		
		System.out.println("\n==== ȸ�� �˻� ====");
		
		System.out.print("�˻��� �̸� : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search);
		
		if(searchPerson == null) {
			
			System.out.println("ȸ�� ������ ã�� �� �����ϴ�.");
			
		}else {
			
			System.out.println(searchPerson.toString());
			
		}
		
	}
	
	public void avgWealth() {
		
		System.out.println("\n==== ȸ�� ��� ��� ��ȸ ====");
		
		int count = pc.selectCount();
		
		if(count == 0) {
			
			System.out.println("�߰��� ȸ���� �����ϴ�.");
			
		}else {
			
			System.out.println(pc.avgWealth());
			
		}
		
	}

}













