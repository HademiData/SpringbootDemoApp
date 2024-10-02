package com.Hademi.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudent (){
        return List.of(
                new Student(
                        "Ali",
                        "Bouali",
                        LocalDate.now(),
                        "contact@ali.com",
                        24
                ),
                new Student(
                        "Ade",
                        "wale",
                        LocalDate.now(),
                        "contact@ade.com",
                        30
                )
                );

    }


}
