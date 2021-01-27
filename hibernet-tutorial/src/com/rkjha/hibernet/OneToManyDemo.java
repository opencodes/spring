package com.rkjha.hibernet;

import com.rkjha.hibernet.entity.Course;
import com.rkjha.hibernet.entity.Instructor;
import com.rkjha.hibernet.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneToManyDemo {
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
            Instructor instructor = new Instructor("Susan","Patel","dsfsdf.com");
            InstructorDetail instructorDetail = new InstructorDetail("sdfsdf.com","sdfsd");
            instructor.setInstructorDetail(instructorDetail);
            List<Course> list = new ArrayList<>();
            Course course = new Course("Course 3");
            list.add(course);
            instructor.add(course);
            // start a transaction
            session.beginTransaction();
            session.save(course);
            session.save(instructor);
            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println("Some Error ");
            session.close();
            factory.close();
        }
    }
}
