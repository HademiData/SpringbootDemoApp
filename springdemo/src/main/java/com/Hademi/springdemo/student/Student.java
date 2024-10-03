package com.Hademi.springdemo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    public String firstname;

    public String lastname;

    LocalDate DateOfBirth;

    @Column(unique = true)
    public String email;

    @Transient
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



    public Integer getId() { return id;}

    public void setId(Integer id) { this.id = id; }
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
        return Period.between(DateOfBirth, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }
}
