package com.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity     //making this class as a entity class for mapping
@Table(name = "cms")      //for mapping database tables
@Getter
@Setter
public class StudentEntity {
    @Id     //taking sid as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private int sid;
    @Column(length = 30)
    private String sname;
    @Column(length = 30)
    private String add;
    @Column(length = 20)
    private String mail;
    @Column(length = 2)
    private int age;
    @Column(length = 12)
    private long phone;
    @Column(length = 15)
    private String dept;
    @Column(length = 3)
    private double marks;
}
