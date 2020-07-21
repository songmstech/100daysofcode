package com.song.run;

import java.util.Scanner;

import com.song.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
/*	
		Book[] books = new Book[3];
		
		books[0] = new Book();
		books[1] = new Book("책1", "작가1", 30000, "상상이상");
		books[2] = new Book();
		
		System.out.println(books);
		System.out.println(books[1]);
		System.out.println(books[1].getPrice());
*/
		
		
		Book[] books = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		
		
		// 1. 전체도서 입력 기능
		for(int i = 0; i < books.length; i++) {
						
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		
		
		// 2. 전체 도서 정보 조회하기 기능
		for(int i = 0; i < books.length; i++) {
			
			System.out.println(books[i].toString());
			
		}
		
		
		// 3. 도서 제목 검색하기 기능
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i < books.length; i++) {
			
			if(books[i].getTitle().equals(search)) {
				
				System.out.println(books[i].toString());
				count++;
				
			}
		}
		
		if(count == 0) {
			System.out.println("검색되는 도서가 없습니다.");
		}
		
	}

}


















