package com.example.demo.newservice.newserviceimpl;

import com.example.demo.NewfileEntity;

public class NewfileServiceImpl implements NewfileService{
    @Override
    NewfileEntity savedata(NewfileEntity newfile){

    }
    @Override
    NewfileEntity getIdvalue(Long id){
        
    }
    List<NewfileEntity> getall();
    NewfileEntity update(Long id,NewfileEntity newfile);
    void del(Long id);
}