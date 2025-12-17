package com.example.demo.newservice.newserviceimpl;

import com.example.demo.newentity.NewfileEntity;
import java.util.*;
import com.example.demo.newservice.NewfileService;;
@Service
public class NewfileServiceImpl implements NewfileService{

    private final NewfileRepo rep;

    public NewfileServiceImpl(NewfileRepo rep){
        this.rep = rep;
    }
    @Override
    public NewfileEntity savedata(NewfileEntity newfile){
        return rep.save(newfile);
    }
    @Override
    public NewfileEntity getIdvalue(Long id){
        return rep.
    }
    @Override
    public List<NewfileEntity> getall(){

    }
    @Override
    public NewfileEntity update(Long id,NewfileEntity newfile){

    }
    @Override
    public void del(Long id){

    }
}