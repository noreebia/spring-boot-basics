package practice;

import org.springframework.stereotype.Component;

public class Thing {
	String name;
	int age;
	
	public Thing() {
		this.name = "component, not bean";
		this.age = 100;
	}
	
	public Thing(String name, int age) {
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
}
