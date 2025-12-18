package com.example.demo.newcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;
import java.util.*;
@RestController
public class NewfileController{

    @Autowired
    NewfileService src;
    @PostMapping("/post")
    public NewfileEntity savedata(@RequestBody NewfileEntity st){
        return src.postData(st);
    }
    @GetMapping("/getting")
    public List<NewfileEntity> getData(){
        return src.getall();
    }
    @GetMapping("/getid/{id}")
    public NewfileEntity sepData(@PathVariable Long id){
        return src.getIdvalue(id);

    }
    @PutMapping("/update/{id}")
    public NewfileEntity updateData(@PathVariable Long id,@RequestBody NewfileEntity st){
        return src.update(id,st);
    }
    @DeleteMapping("/delete/{id}")
    public void del(@PathVariable Long id){
         src.deletedata(id);
    }

    
}