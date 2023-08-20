package com.helani.EMPBackend.service;

import com.helani.EMPBackend.dto.EmployeeDTO;
import com.helani.EMPBackend.entity.Employee;
import com.helani.EMPBackend.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO){
       employeeRepository.save(modelMapper.map(employeeDTO, Employee.class));
       return employeeDTO;
    }
}
