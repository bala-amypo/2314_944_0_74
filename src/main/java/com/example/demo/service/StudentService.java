package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import com.example.demo.entity.StudentEntity;



public interface StudentService{
    StudentEntity postdata(StudentEntity st);
    List<StudentEntity> getdata();
    StudentEntity update(int id,StudentEntity st);
    void deletedata(int id);
}