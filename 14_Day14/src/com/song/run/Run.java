package com.song.run;

import java.util.Scanner;

import com.song.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
/*	
		Book[] books = new Book[3];
		
		books[0] = new Book();
		books[1] = new Book("å1", "�۰�1", 30000, "����̻�");
		books[2] = new Book();
		
		System.out.println(books);
		System.out.println(books[1]);
		System.out.println(books[1].getPrice());
*/
		
		
		Book[] books = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		
		
		// 1. ��ü���� �Է� ���
		for(int i = 0; i < books.length; i++) {
						
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		
		
		// 2. ��ü ���� ���� ��ȸ�ϱ� ���
		for(int i = 0; i < books.length; i++) {
			
			System.out.println(books[i].toString());
			
		}
		
		
		// 3. ���� ���� �˻��ϱ� ���
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i < books.length; i++) {
			
			if(books[i].getTitle().equals(search)) {
				
				System.out.println(books[i].toString());
				count++;
				
			}
		}
		
		if(count == 0) {
			System.out.println("�˻��Ǵ� ������ �����ϴ�.");
		}
		
	}

}


















