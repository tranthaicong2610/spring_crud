package com.example.demo.service;

import com.example.demo.model.Employee;
import java.util.List;


public interface IEmployeeService {
    // ham them nhan vien
    public Employee addEmployee(Employee employee);

    // ham chinh sua thong tin nhan vien
    public Employee updateEmployee(long id ,Employee employee);

    // ham xoa nhan vien
    public boolean deleteEmployee(long id );

    //ham lay danh sach sinh vien
    public List<Employee> getAllEmployee();

    // ham lay ra 1 nhan vien
    public Employee getOneEmployee(long id);
}
