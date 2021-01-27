package com.rkjha.hibernet;

import com.rkjha.hibernet.entity.Course;
import com.rkjha.hibernet.entity.Instructor;
import com.rkjha.hibernet.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneToManyReadDemo {
    public static void main(String[] args) {
        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate-one-to-one.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        // Create Session
        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            Instructor instructor = session.get(Instructor.class, 4);
            System.out.println("instructor = " + instructor.getCourses());

            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println("Some Error ");
            session.close();
            factory.close();
        }
    }
}
