package com.helani.EMPBackend.controller;

import com.helani.EMPBackend.dto.EmployeeDTO;
import com.helani.EMPBackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping("/getAllEmployees")
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PutMapping("/updateEmployee")
    public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }

    @DeleteMapping("/deleteEmployee/{empId}")
    public Boolean deleteEmployee(@PathVariable int empId){
        return employeeService.deleteEmployee(empId);
    }
}
