package com.example.student.service;

import com.example.student.model.Studentmodel;
import com.example.student.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Studentservice {
    @Autowired
    Studentrepository studrepobj;
    public void addstudent(Studentmodel studentmodelobj) {

        studrepobj.save(studentmodelobj);
    }

    public List<Studentmodel> display() {

        return studrepobj.findAll();
    }

    public Optional<Studentmodel> displaybyid(int id) {
        return studrepobj.findById(id);
    }

    public String deletebyid(int id) {
        studrepobj.deleteById(id);
        return "record is deleted";
    }

    public String update(int id, Studentmodel studentmodelobj) {
        if(studrepobj.findById(id)!=null){
            studrepobj.deleteById(id);
            studrepobj.save(studentmodelobj);
            return "updated";
        }
        return "id not exist in database";
    }
}
