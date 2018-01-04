package com.test.web.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.test.web.dao.Person;

public class HashSetTest {
	
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		Set set = new HashSet();
		set.add(str1);
		set.add(str2);
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String object = (String) iterator.next();
			System.out.println(object);
		}
	}
	
	@Test
	public void setObject(){
		Person p1 = new Person("lise",27);
		Person p2 = new Person("lise",27);
		Set set = new HashSet();
		set.add(p1);
		set.add(p2);
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Person p = (Person) iterator.next();
			System.out.println(p.getName()+"..........."+p.getAge());
		}
	}
}
