package com.example.student.control;

import com.example.student.model.Studentmodel;
import com.example.student.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Studentcontrol {
    @Autowired
    Studentservice studserobj;
    @PostMapping("/add")
    public String addstudent(@RequestBody Studentmodel studentmodelobj){
        studserobj.addstudent(studentmodelobj);
        return "student added";
    }
    @GetMapping("/displayAll")
    public List<Studentmodel> display(){
        return studserobj.display();
    }

    @GetMapping("/displaybyID/{id}")
    public Optional<Studentmodel> dispayId(@PathVariable int id){
        return studserobj.displaybyid(id);
    }
    @DeleteMapping("/deletebyID/{id}")
    public String deleteId(@PathVariable int id){
        return studserobj.deletebyid(id);
    }
    @PutMapping("/update/{id}")
    public String Update(@PathVariable int id, @RequestBody Studentmodel studentmodelobj){
        return studserobj.update(id, studentmodelobj);
    }
}
