package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.*;
import jakarta.persistence.*;

public interface StudentRepository extends JpaRepository<Student,Id>{
	

}
