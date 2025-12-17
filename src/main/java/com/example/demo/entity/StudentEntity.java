package com.example.demo.entity;

import java.time.LocalDate;

public class Studententity {
    private String name;
    private int id;
    private LocalDate dob;
    private float cgpa;
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public LocalDate getDob() {
        return dob;
    }
    public Studententity(String name, int id, LocalDate dob, float cgpa) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.cgpa = cgpa;
    }
    public float getCgpa() {
        return cgpa;
    }
    
        
}
