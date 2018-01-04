package com.test.web.dao;

public class Person {
	
	private String name;
	
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return this.name.hashCode()+this.age*31;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equeals");
		Person p = (Person)obj;
		return this.name.equals(p.getName()) && this.age == p.getAge();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
