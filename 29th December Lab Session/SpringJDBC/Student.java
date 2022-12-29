package com.springjdbc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {      //Student class
    private int id;
    private String name;
    private String email;
    private String address;
    private int age;

    public Student() {      // constructor
        super();
    }

    public Student(int id, String name, String email, String address, int age) {        //peremeterise constructor
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
    }
}
