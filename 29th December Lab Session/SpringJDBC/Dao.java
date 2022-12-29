package com.springjdbc;

public interface Dao {      //dao interface
    public int insert(Student student);         //insert method

    public int update(Student student, int id); //update method

    public int delete(Student student, int id); //delete method
}