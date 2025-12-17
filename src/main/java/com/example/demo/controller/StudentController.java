package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;
import java.util.*;
@RestController
public class Studentcontroller {
    @Autowired
    Studentservice src;
    @PostMapping("/post")
    public Studententity postData(@RequestBody Studententity st){
        return src.savedata(st);
    }
    @GetMapping("/getting")
    public List<Studententity> getData(){
        return src.retdata();
    }
    @GetMapping("/getid/{id}")
    public Studententity sepData(@PathVariable int id){
        return src.indData(id);

    }
    @PutMapping("/update/{id}")
    public Studententity updateData(@PathVariable int id,@RequestBody Studententity st){
        return src.updat(id,st);
    }
    @DeleteMapping("/delete/{id}")
    public void del(@PathVariable int id){
         src.delete(id);
    }
}
