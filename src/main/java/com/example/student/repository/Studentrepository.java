package com.example.student.repository;

import com.example.student.model.Studentmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Studentmodel,Integer>{
}
//extends JpaRepository<Studentmodel,Integer>