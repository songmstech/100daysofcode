package com.song.controller;

import com.song.model.vo.Person;

public class PersonController {
	
	private Person[] p = new Person[3];
	
	private int count = 0;
	
	public int insertPerson(String name, int age, int wealth) {
		
		int result = 0;
		
		if(count < p.length) {
			
			p[count++] = new Person(name, age, wealth);
			result = 1;
			
		}else {
			
			result = 0;
			
		}
		
		return result;
	}
	
	public int selectCount() {
		
		return count;
		
	}
	
	public Person[] selectPerson() {
		
		return p;
		
	}
	
	public Person searchPerson(String search) {
		
		Person searchPerson = null;
		
		for(int i = 0; i < count; i++) {
			
			if(p[i].getName().equals(search)) {
				
				// System.out.println(p[i].toString());
				searchPerson = p[i];
				
			}
			
		}
		
		return searchPerson;
	}
	
	public int avgWealth() {
		
		int sum = 0 ;
		
		for(int i = 0; i<count; i++) {
			
			sum = sum + p[i].getWealth();
			
		}
		
		return sum/count;
		
	}
}

























