package com.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor 
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String dept;
    private String job;
    private Double salary;
    private LocalDate hireDate;
    private String phone;
    private String email;
}
