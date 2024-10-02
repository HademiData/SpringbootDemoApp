package com.Hademi.springdemo.student;

import java.time.LocalDate;

public class Student {
    public String firstname;

    public String lastname;

    LocalDate DateOfBirth;

    public String email;

    public int age;


    public Student (){

    }
    public Student(String firstname,
                   String lastname,
                   LocalDate dateOfBirth,
                   String email,
                   int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        DateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
