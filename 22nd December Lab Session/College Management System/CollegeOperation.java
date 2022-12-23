package com.cms;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CollegeOperation {

    public void addStudent() {
        // opens and connection with db and session object perform CURD
        Session ses = HibernateUtil.getSessionFactory().openSession();
        // operation performed in db, save permenent
        Transaction t = ses.beginTransaction();
        int age;
        String sname, add, mail, dept;
        long phone;
        double marks;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Students's name : ");
        sname = s.next();
        System.out.println("Enter Students's Address : ");
        add = s.next();
        System.out.println("Enter Student's email : ");
        mail = s.next();
        System.out.println("Enter Student's age : ");
        age = s.nextInt();
        System.out.println("Enter Student's phone number : ");
        phone = s.nextLong();
        System.out.println("Enter Student's Department name : ");
        dept = s.next();
        System.out.println("Enter Student's semester Marks : ");
        marks = s.nextDouble();
        // create object of persistent class
        StudentEntity se = new StudentEntity();
        se.setSname(sname);
        se.setAdd(add);
        se.setMail(mail);
        se.setAge(age);
        se.setPhone(phone);
        se.setMarks(marks);
        se.setDept(dept);
        ses.save(se);
        t.commit();
        System.out.println("Student has been Successfully Added");
        ses.close();
    }

    public void fetchStudent() {
        // opens and connection with db and session object perform CURD
        Session session = HibernateUtil.getSessionFactory().openSession();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter user id : ");
        long id = s.nextLong();
        StudentEntity se = session.load(StudentEntity.class, id);
        System.err.println("--------------------------------------------------------");
        System.out.println(" Student id              :" + se.getSid() +
                "\n Student Name         : " + se.getSname() +
                "\n Student Address      : " + se.getAdd() +
                "\n Student email        : " + se.getMail() +
                "\n Student age          : " + se.getAge() +
                "\n Student phone number : " + se.getPhone() +
                "\n Student Department   : " + se.getDept() +
                "\n Student Marks        : " + se.getMarks());
        System.err.println("--------------------------------------------------------");
        session.close();
    }

    public void updateStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Scanner s = new Scanner(System.in);
        Transaction t = session.beginTransaction();
        System.out.println("Enter user id : ");
        long id = s.nextLong();
        StudentEntity se = session.get(StudentEntity.class, id);
        System.out.println("Enter your Updated Adress : ");
        String add = s.next();
        se.setAdd(add);
        System.out.println("Enter your Updated email : ");
        String eml = s.next();
        se.setMail(eml);
        System.out.println("Enter your Updated age : ");
        int age = s.nextInt();
        se.setAge(age);
        System.out.println("Enter your Updated Phone number : ");
        long phn = s.nextLong();
        se.setPhone(phn);
        System.out.println("Enter your Updated Department : ");
        String dept = s.next();
        se.setDept(dept);
        System.out.println("Enter your Updated Marks : ");
        double mk = s.nextDouble();
        se.setMarks(mk);
        session.update(se);
        t.commit();
        System.err.println("---Email Updated successfylly---");
        session.close();
    }

    public void deleteStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Scanner s = new Scanner(System.in);
        Transaction t = session.beginTransaction();
        System.err.println("Enter user id : ");
        long id = s.nextLong();
        StudentEntity se = session.load(StudentEntity.class, id);
        session.delete(id);
        t.commit();
        System.err.println("Student record Deleted successfylly");
        session.close();
    }
}
