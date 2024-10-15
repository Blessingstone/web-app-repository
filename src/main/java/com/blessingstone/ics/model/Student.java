package com.blessingstone.ics.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Student
{
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private String course;
    private String password;
    
    public Student()
    {
	
    }
    
    public Student(String id, String emailAddress, int age, String course)
    {
	this.id = id;
	this.emailAddress = emailAddress;
	this.age = age;
	this.course = course;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }
    public String getPassword()
    {
	return password;
    }

    public void setPassword(String password)
    {
	this.password = password;
    }

    public String getFirstName()
    {
	return firstName;
    }

    public void setFirstName(String firstName)
    {
	this.firstName = firstName;
    }

    public String getLastName()
    {
	return lastName;
    }

    public void setLastName(String lastName)
    {
	this.lastName = lastName;
    }

    @Override
    public String toString()
    {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
		+ emailAddress + ", age=" + age + ", course=" + course + ", password=" + password + "]";
    }

    
    
    
    
        

}
