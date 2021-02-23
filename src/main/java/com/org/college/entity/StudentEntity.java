package com.org.college.entity;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="studentEntity")
public class StudentEntity {
    @Id
    private String name;

    private  int id;

}
