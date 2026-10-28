package com.entity;

import java.util.List;

import lombok.Data;

@Data
public class Clazz {
    private Integer cid;
    private String cname;
    private Integer teacherId;
    private Teacher teacher; 
    private List<Student> students;
}
