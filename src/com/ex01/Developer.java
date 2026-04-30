package com.ex01;

import java.lang.String;

public class Developer {
	int age;
	double height;
	String degree;
	double salery;
	int years_experience;
	
	Developer(){
		this.age = 0;
		this.height = 0.0;
		this.degree = "nothing yet";
		this.salery = 0.0;
		this.years_experience = 0;
	}
	
	public String program() {
		String written_code = "";
		// Human intelligence magic ...
		return written_code;
	}
	
	public String document() {
		String documentation = "";
		// Human intelligence magic ...
		return documentation;
	}
	
	public String presentResults() {
		String presentation = "";
		// Human intelligence magic ...
		return presentation;
	}
	
	public void eat(String Food) {
		System.out.println("eating...");
		System.out.println("Burp!");
	}
	
	public void sleep() {
		System.out.println("zzzzzzzZZZZZZZ");
	}
	
	public int get_age() {
		return this.age;
	}

	public double get_height() {
		return this.height;
	}

	public String get_degree() {
		return this.degree;		
	}

	public double get_salery() {
		return this.salery;
	}

	public int get_years_experience() {
		return this.years_experience;
	}

	public void set_age(int age) {
		try{
			this.age = age;
		}	
		catch(Exception e) {}
	}
	public void set_height(double height) {
		try{
			this.height = height;
		}
		catch(Exception e) {}
	}
	public void set_degree(String degree) {
		try {
			this.degree = degree;
		}
		catch(Exception e) {}
		
	}
	public void set_salery(double salery) {
		try {
			this.salery = salery;
		}
		catch(Exception e) {}
	}
	public void set_years_experience(int years) {
		try {
			this.years_experience = years;
		}
		catch(Exception e) {}
	}
}
