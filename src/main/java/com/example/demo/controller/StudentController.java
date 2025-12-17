package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import java.util.*;
@RestController
public class StudentController {
    @Autowired
    StudentService src;
    @PostMapping("/post")
    public StudentEntity postData(@RequestBody StudentEntity st){
        return src.savedata(st);
    }
    @GetMapping("/getting")
    public List<StudentEntity> getData(){
        return src.retdata();
    }
    @GetMapping("/getid/{id}")
    public StudentEntity sepData(@PathVariable int id){
        return src.indData(id);

    }
    @PutMapping("/update/{id}")
    public StudentEntity updateData(@PathVariable int id,@RequestBody StudentEntity st){
        return src.updat(id,st);
    }
    @DeleteMapping("/delete/{id}")
    public void del(@PathVariable int id){
         src.delete(id);
    }
}
