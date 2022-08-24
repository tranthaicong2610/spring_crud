package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;


    @GetMapping("/")
    public String test(){
        return "tinoday";
    }

    // API add employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
            return iEmployeeService.addEmployee(employee);
    }

    // API update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id , @RequestBody Employee employee){
        return iEmployeeService.updateEmployee(id, employee);
    }

    //API delete employee
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") long id){
        return iEmployeeService.deleteEmployee(id);
    }

    // API lau danh sach
    @GetMapping("/list")
    public List<Employee> getAllemployee(){
        return iEmployeeService.getAllEmployee();
    }
}
