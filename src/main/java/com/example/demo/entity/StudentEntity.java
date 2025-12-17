package com.example.demo.entity;

import java.time.LocalDate;

public class StudentEntity {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private float cgpa;
    public String getName() {
        return name;
    }
    public Long getId() {
        return id;
    }
    public LocalDate getDob() {
        return dob;
    }
    public StudentEntity(String name, int id, LocalDate dob, float cgpa) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.cgpa = cgpa;
    }
    public float getCgpa() {
        return cgpa;
    }
    
        
}
