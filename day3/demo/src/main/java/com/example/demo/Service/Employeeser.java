package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.Employeerep;

@Service
public class Employeeser {
  @Autowired
	Employeerep re;
  public Employee saveinfo(Employee e) {
	  return re.save(e);
  }
  public List<Employee> show(){
	  return re.findAll();
  }
}
