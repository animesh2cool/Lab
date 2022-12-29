package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App { // main class
    public static void main(String[] args) {            //main method
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");     // configuring and connecting xml file to jdbc
        Dao dao = ac.getBean("DaoImpl", Dao.class);             // returning instance of DaoImpl class through getBean method
        // Student st = new Student();
        // st.setId(1001);
        // st.setName("Animesh");
        // st.setEmail("animanna@gmail.com");
        // st.setAge(30);
        // st.setAddress("Kolkata");
        Student st2 = new Student();
        // st2.setId(1002);
        // st2.setName("Rahul");
        // st2.setEmail("rahul10@gmail.com");
        // st2.setAge(27);
        // st2.setAddress("Kolkata");
        // dao.update(st2,1002); // for update
        dao.delete(st2, 1002); // for delete
    }
}