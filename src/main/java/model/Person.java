package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import ch.qos.logback.core.net.SyslogOutputStream;

@Document
public class Person {

	@Id
	String id;
	String firstName;
	String lastName;
	int age;

	public Person(String firstName, String lastName, int age) {

		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person firstname: " +firstName+ " LastName: "+lastName+" Age: "+age;
	}
	
	
	
}
