package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.*;

public interface Employeerep extends JpaRepository<Employee,Integer>{

}
