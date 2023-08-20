package com.helani.EMPBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private int empId;
    private String empFirstName;
    private String empLastName;
    private String empEmail;
    private String empAddress;
    private String empPhone;
}
